import requests

import swagger_client
from swagger_client import Configuration


def get_access_token():
    client_id = "client_id"
    client_secret = "client_secret"
    grant_type = 'client_credentials'
    base_url = "https://api.sansa.wunderfolio.net/v1"
    auth_url = base_url + "/oauth/token?grant_type=client_credentials"

    response = requests.post(auth_url, auth=(client_id, client_secret),
                            data={"grant_type": grant_type, "client_id": client_id, "client_secret": client_secret})
    access_token = 'access_token'
    configuration = Configuration()
    configuration.access_token = access_token
    configuration.host = base_url

    api_instance = swagger_client.PortfoliosApi(swagger_client.ApiClient(configuration))
    portfolios = api_instance.get_portfolios()

    print(portfolios)


if __name__ == '__main__':
    get_access_token()
