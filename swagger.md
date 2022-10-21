# OpenAPI definition
## Version: v0

### /api/wallet

#### POST
##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Bad Request |
| 500 | Internal Server Error |

### /api/hello

#### GET
##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
| 400 | Bad Request |
| 500 | Internal Server Error |

### Models

#### CreateWalletDTO

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| name | string |  | Yes |

#### WalletDTO

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| name | string |  | No |
| creationDate | dateTime |  | No |
