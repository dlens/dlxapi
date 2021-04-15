import requests

from constants import base_url, client_id, client_secret
from from_json import FromJson


def get_access_token():
    grant_type = 'client_credentials'
    auth_url = base_url + "/oauth/token?grant_type=client_credentials"

    response = requests.post(auth_url, auth=(client_id, client_secret),
                            data={"grant_type": grant_type, "client_id": client_id, "client_secret": client_secret})

    return FromJson(response.content).access_token

