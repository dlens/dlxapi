# Regenerating the Python API client

This refresh uses Swagger Codegen CLI **3.0.43** and the `dlx-server` **prod**
API specification at commit `90ea8d4f40d168e35ac6eb5bc046078c7e16b800`.
Use **`api-client/src/main/resources/swagger/swagger.yaml`** from that checkout
as the generation input. Its SHA-256 is `708830b82f4daef0100b8c2b34ac40b0d5d8c31088fc5a8a861f90bf98c89475`.
Do not use `swagger-processed.yaml` or concatenate the source fragments for
Python client generation. Copy `swagger.yaml` into this directory before running
the commands below, or pass its full path with `-i`.

Generate into two empty temporary directories:

```sh
java -jar swagger-codegen-cli-3.0.43.jar generate \
  -l python -t codegen-templates -i swagger.yaml -o generated-dlxapi \
  --additional-properties packageName=dlxapi,projectName=swagger-client,packageVersion=1.0.3,packageUrl=https://github.com/dlens/dlxapi \
  --git-user-id dlens --git-repo-id dlxapi
java -jar swagger-codegen-cli-3.0.43.jar generate \
  -l python -t codegen-templates -i swagger.yaml -o generated-swagger-client \
  --additional-properties packageName=swagger_client,projectName=swagger-client,packageVersion=1.0.3,packageUrl=https://github.com/dlens/dlxapi \
  --git-user-id dlens --git-repo-id dlxapi
```

Replace the generated packages, docs, and test stubs with the fresh output;
use docs and test stubs from `generated-dlxapi`. Keep both import namespaces.
Preserve the handwritten `dlxapi/access_token.py`, `constants.py`, `from_json.py`,
`quick_start_example.py`, and the top-level `main.py`.

Keep the existing dependency minimums in `setup.py` and the `requests`
dependency used by the token helper. Keep the README installation URL's
`#subdirectory=python` suffix. Copy the generator version marker from the output.

Validate imports of every API/model module in both namespaces, inherited model
fields (including `Spreadsheet.id`), request construction, response decoding,
and wheel installation before publishing.

## Publishing the prebuilt wheel

After regeneration and validation, build from this `python` directory:

```sh
python -m pip wheel --no-deps --wheel-dir dist .
```

Commit `dist/swagger_client-1.0.3-py3-none-any.whl` with the generated source
updates. Rebuild it whenever the Python package changes. The 1.0.3 wheel includes the custom discriminator template below.

## Python discriminator template

`codegen-templates/model.mustache` overrides the Swagger Codegen 3.0.43
`handlebars/python/model.mustache` template. Always pass `-t codegen-templates`
when regenerating either namespace (commands above assume this directory).

The override preserves case-sensitive discriminator mapping keys and only
looks up string discriminator values. Missing, null, or object values retain
the declared model type. This accommodates the shared specification's
`FieldValue.field` discriminator, whose actual payload is a nested object,
without changing other language clients or hand-editing generated Python.

Run `python -m unittest discover -s test -p test_discriminator_decoding.py`
to check nested field values, absent/non-string discriminators, and normal
string-based subtype decoding in both import namespaces.

## Partial response resources

The custom `api_client.mustache` passes `_check_required=False` when decoding
responses. The model template skips missing required constructor arguments in
that mode and propagates it to parent models. Nested resource references such
as `Field.source` can therefore omit `Source.type`. Normal model construction
and property assignment still enforce required fields.
