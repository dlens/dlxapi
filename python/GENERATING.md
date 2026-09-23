# Regenerating the Python API client

This refresh uses Swagger Codegen CLI **3.0.43** and the `dlx-server` **prod**
API specification at commit `90ea8d4f40d168e35ac6eb5bc046078c7e16b800`.
The merged specification SHA-256 is `bc1215192f8d714e481f55975b37dac18af4d92bf3da790e8a38015e3529b388`.

Build the specification from `api-spec/src/main/resources` by concatenating the
`swagger/*` arguments of `exec-maven-plugin` in `api-event/pom.xml`, in order.
This follows `MergeSwagger` without relying on an older consolidated artifact.

Generate into two empty temporary directories:

```sh
java -jar swagger-codegen-cli-3.0.43.jar generate \
  -l python -t codegen-templates -i swagger-processed.yaml -o generated-dlxapi \
  --additional-properties packageName=dlxapi,projectName=swagger-client,packageVersion=1.0.1,packageUrl=https://github.com/dlens/dlxapi \
  --git-user-id dlens --git-repo-id dlxapi
java -jar swagger-codegen-cli-3.0.43.jar generate \
  -l python -t codegen-templates -i swagger-processed.yaml -o generated-swagger-client \
  --additional-properties packageName=swagger_client,projectName=swagger-client,packageVersion=1.0.1,packageUrl=https://github.com/dlens/dlxapi \
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

Commit `dist/swagger_client-1.0.1-py3-none-any.whl` with the generated source
updates. Rebuild it whenever the Python package changes. The 1.0.1 wheel includes the custom discriminator template below.

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
