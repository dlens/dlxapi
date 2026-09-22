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
  -l python -i swagger-processed.yaml -o generated-dlxapi \
  --additional-properties packageName=dlxapi,projectName=swagger-client,packageVersion=1.0.0,packageUrl=https://github.com/dlens/dlxapi \
  --git-user-id dlens --git-repo-id dlxapi
java -jar swagger-codegen-cli-3.0.43.jar generate \
  -l python -i swagger-processed.yaml -o generated-swagger-client \
  --additional-properties packageName=swagger_client,projectName=swagger-client,packageVersion=1.0.0,packageUrl=https://github.com/dlens/dlxapi \
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

Commit `dist/swagger_client-1.0.0-py3-none-any.whl` with the generated source
updates. Rebuild it whenever the Python package changes. The wheel currently
contains the source from commit `4c13ca4b0a49c5417f7a63a58250decaa3f606f9`.
