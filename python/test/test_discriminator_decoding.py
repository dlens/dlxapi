import importlib
import json
import unittest
from types import SimpleNamespace


class TestDiscriminatorDecoding(unittest.TestCase):
    def test_partial_source_response_and_required_constructor(self):
        payload = {"items": [{"id": "field-id", "source": {"id": "source-id"}}]}
        for namespace in ("dlxapi", "swagger_client"):
            with self.subTest(namespace=namespace):
                package = importlib.import_module(namespace)
                fields = package.ApiClient().deserialize(
                    SimpleNamespace(data=json.dumps(payload)), "Fields"
                )
                self.assertEqual(fields.items[0].source.id, "source-id")
                self.assertIsNone(fields.items[0].source.type)
                with self.assertRaises(ValueError):
                    package.Source()
                with self.assertRaises(ValueError):
                    fields.items[0].source.type = None

    def test_nested_field_values_decode_in_both_namespaces(self):
        payload = {
            "items": [{
                "id": "project-id",
                "name": "Example",
                "fieldValues": {"items": [{
                    "field": {"id": "total-request-id"},
                    "numericValue": 1250.0,
                }]},
            }],
        }
        for namespace in ("dlxapi", "swagger_client"):
            with self.subTest(namespace=namespace):
                package = importlib.import_module(namespace)
                projects = package.ApiClient().deserialize(
                    SimpleNamespace(data=json.dumps(payload)), "Projects"
                )
                value = projects.items[0].field_values.items[0]
                self.assertEqual(value.field.id, "total-request-id")
                self.assertEqual(value.numeric_value, 1250.0)

    def test_discriminator_values_are_checked_without_lowercasing(self):
        for namespace in ("dlxapi", "swagger_client"):
            package = importlib.import_module(namespace)
            for value in (None, {}, [], 123):
                with self.subTest(namespace=namespace, value=value):
                    self.assertIsNone(package.FieldValue().get_real_child_model({"field": value}))
            self.assertIsNone(package.FieldValue().get_real_child_model({}))
            self.assertEqual(
                package.FieldValue().get_real_child_model({"field": "FieldData"}),
                "FieldData",
            )
            self.assertIsNone(package.FieldValue().get_real_child_model({"field": "fielddata"}))

    def test_string_discriminator_still_selects_subtype(self):
        for namespace in ("dlxapi", "swagger_client"):
            with self.subTest(namespace=namespace):
                package = importlib.import_module(namespace)
                value = package.ApiClient().deserialize(
                    SimpleNamespace(data=json.dumps({"href": "Spreadsheet", "id": "sheet-id"})),
                    "DlResource",
                )
                self.assertIsInstance(value, package.Spreadsheet)
                self.assertEqual(value.id, "sheet-id")


if __name__ == "__main__":
    unittest.main()
