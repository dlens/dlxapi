# DLX API

## API CLIENT 
Generate your API CLIENT using swagger in the language you want

1. Install and run docker 
2. Create a folder called dl-api-client
2. Go to dl-api-client folder
2. To generate code in Java, from dl-api-client folder, on command line run 
```{sh}
docker run --rm -v ${PWD}:/local swaggerapi/swagger-codegen-cli generate -i https://api-gov.decisionlens.com/v1/swagger.yaml  -l java -o /local --api-package=com.decisionlens.client.api --model-package=com.decisionlens.client.model -DhideGenerationTimestamp=true -DgroupId=com.decisionlens -DartifactId=dl-api-client
```

Once this runs you should see generated code in dl-api-client folder. It generates both maven pom.xml and gradle build files.  Compile and create a jar file that you can include in your project as dependency. 

Note: If you get an exception compiling with maven generating Javadoc, comment out the maven-java-doc plugin in pom.xml. 

## Invoking DL APIs

Fetching API Access Token 
Using API credentials get the API access token

Sample code to invoke OAuth client_credentials flow

```{java}
import com.google.gson.Gson;
import com.squareup.okhttp.*;

import java.io.IOException;

public class DLAccessToken {
    private final static String CLIENT_ID =  "<client_id>";
    private final static String CLIENT_SECRET =  "<client_secret>";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public String getAccessToken() {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
               .url("https://api-gov.decisionlens.com/oauth/token?grant_type=client_credentials")
               .addHeader("Authorization", Credentials.basic(CLIENT_ID, CLIENT_SECRET))
               .post(RequestBody.create(JSON, ""))
               .build();
        try {
            Response response = httpClient.newCall(request).execute();
            Gson gson = new Gson();
            OAuthResponse oAuthResponse = gson.fromJson(response.body().string(),             OAuthResponse.class);
            return oAuthResponse.access_token;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private class OAuthResponse {
        String access_token;
    }
}
```

DL APIs

```{java}
import com.decisionlens.client.api.FieldsApi;
import com.decisionlens.client.api.PortfolioPlansApi;
import com.decisionlens.client.api.PortfoliosApi;
import com.decisionlens.client.auth.OAuth;
import com.decisionlens.client.model.*;
import com.google.gson.Gson;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DLApi {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gov.decisionlens.com/v1");
        defaultClient.setDebugging(false);
        defaultClient.setJSON(new JSON().setGson(new Gson()));

        // Configure OAuth2 access token for authorization: OAuth2
        DLAccessToken dlAccessToken = new DLAccessToken();
        String accessToken = dlAccessToken.getAccessToken();
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken(accessToken);

        PortfoliosApi portfoliosApi = new PortfoliosApi();
        try {
            Portfolios portfolios = portfoliosApi.getPortfolios(null, null, null, null, null);

            // find my portfolio from the list of portfolios
            Portfolio portfolio = portfolios.getItems().stream().filter(p -> p.getName().equalsIgnoreCase("My Portfolio")).findAny().orElse(null);

            // get fields for my portfolio
            FieldsApi fieldsApi = new FieldsApi();
            Fields fields = fieldsApi.getFieldsForPortfolio(portfolio.getId(), null, null, null, null, null);
            Map<String, Field> fieldNameLookup = fields.getItems().stream().collect(Collectors.toMap(Field::getName, f -> f));

            // get portfolio plans for the portfolio
            PortfolioPlansApi portfolioPlansApi = new PortfolioPlansApi();
            PortfolioPlans portfolioPlans = portfolioPlansApi.getPortfolioPlans(portfolio.getId(), null, null, null, null, null);

            // find Baseline Plan for the portfolio
            PortfolioPlan portfolioPlan = portfolioPlans.getItems().stream().filter(pp -> pp.getName().equalsIgnoreCase("Baseline Plan")).findAny().orElse(null);

            // get projects with field values for the Baseline Plan
            String expand = "[{\"path\":\"items.fieldValues\"}]";
            Projects projects = portfolioPlansApi.getProjectsForPortfolioPlan(portfolioPlans.getItems().get(0).getId(), expand, null, null, null, null);

            // project lookup by name (assuming project names are unique)
            Map<String, Project> projectNameLookup = projects.getItems().stream().collect(Collectors.toMap(Project::getName, pr -> pr));

            // feb 1, 2020
            LocalDateTime localDateTime = LocalDateTime.of(2020, 2, 1, 0, 0);
            long feb = localDateTime.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli();

            // mar 1, 2020
            localDateTime = LocalDateTime.of(2020, 3, 1, 0, 0);
            long march = localDateTime.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli();

            // updating a cost field value for a project
            List<FieldValuePatchItem> patchItems = new ArrayList<>();
            patchItems.add(DLApi.createFieldValuePatchItem(projectNameLookup.get("Project 1").getId(), fieldNameLookup.get("Cost"), new TimePeriod().startDate(feb), null, 100.0, null, OperationType.REPLACE));
            patchItems.add(DLApi.createFieldValuePatchItem(projectNameLookup.get("Project 1").getId(), fieldNameLookup.get("Cost"), new TimePeriod().startDate(march), null, 200.0, null, OperationType.REPLACE));
            List<FieldValue> updatedFieldValues = portfolioPlansApi.updatePortfolioPlanFieldValues(portfolioPlan.getId(), patchItems, null);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi");
            e.printStackTrace();
        }
    }


    public static FieldValuePatchItem createFieldValuePatchItem(String projectId, Field field, TimePeriod timePeriod, String value, Double numericValue, Boolean booleanValue, OperationType operationType) {
        FieldValuePatchItem patchItem = new FieldValuePatchItem();
        patchItem.setProjectId(projectId);
        patchItem.setFieldId(field.getId());
        patchItem.setTimePeriod(timePeriod);
        if (field.getDataType() == DataType.NUMERIC || field.getDataType() == DataType.DATE) {
            patchItem.setOperations(createOperations(operationType, "/numericValue", numericValue != null ? numericValue.toString() : null));
        } else if(DataType.BOOLEAN == field.getDataType()) {
            patchItem.setOperations(createOperations(operationType, "/booleanValue", booleanValue != null ? booleanValue.toString() : Boolean.FALSE.toString()));
        } else {
            patchItem.setOperations(createOperations(operationType, "/value", value));
        }

        return patchItem;
    }

    public static Operations createOperations(OperationType type, String path, String value) {
        Operations operations = new Operations();
        operations.add(createOperation(type, path, value));
        return operations;
    }

    public static Operation createOperation(OperationType type, String path, String value) {
        Operation operation = new Operation();
        operation.setOp(type);
        operation.setPath(path);
        operation.setValue(value);
        return operation;
    }
}
```
