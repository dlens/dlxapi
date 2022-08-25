# API for Decision Lens Accelerate 

[Swagger spec](https://api-gov.decisionlens.com/v1/swagger.yaml) can be downloaded to generate client code. 

This repository contains API's for Decision Lens Accelerate in several programming languages.

* [java](java): The Java API
* [R](R): The R API

## API Token
An API token is required to invoke APIs. This token can be generated using OAUth2 client credentials flow. 

If your instance is running in the DL Cloud, call support to get API credentials for the user that will run integration. You can create a robot account user and get API credentials for this user. Make sure this robot account is in the portfolios that you want to integrate. 

If you are running self-hosted instance call support to get instructions to generate API credentials. 

### Generate API Token 
This sample code uses curl to show how to generate API token from API credentials. 

```
curl -X POST -H -u "client_id:client_secret" "https://api-gov.decisionlens.com/oauth/token?grant_type=client_credentials" -v
```
The curl call above will return a response with access_token. The API access token is valid for 12 hours. 

## Invoking APIs 
Once you have the API access token you are ready to invoke APIs. 

An example API call to fetch all the portfolios that the user has access to 

```
curl -X GET -H "Authorization: <access_token>" "https://api-gov.decisionlens.com/v1/portfolios" 
```

### Uploading a spreadsheet to update project data in the portfolio 
Here is an sample code to update a spreadsheet to update project data in the portfolio. 

```

```

