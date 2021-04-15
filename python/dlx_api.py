import swagger_client
from constants import base_url
from access_token import get_access_token
from swagger_client import Configuration


def dlx_api():
    configuration = Configuration()
    configuration.access_token = get_access_token()
    configuration.host = base_url

    api_instance = swagger_client.PortfoliosApi(swagger_client.ApiClient(configuration))
    portfolios = api_instance.get_portfolio()

    return portfolios


if __name__ == '__main__':
    dlx_api()
