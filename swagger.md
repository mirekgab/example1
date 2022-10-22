# TrackExpensesApp
Open source Track Expenses App

## Version: 0.2.0

**Contact information:**  
bycza-zagroda@gmail.com  

### /api/wallet

#### POST
##### Summary

create new wallet

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| CreateWalletDTO | body | wallet object to create | Yes | [CreateWalletDTO](#createwalletdto) |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | ok |
| 405 | invalid input |

### /api/wallet/{id}

#### GET
##### Summary

get wallet

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | path |  | Yes | long |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | ok |

### Models

#### CreateWalletDTO

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| name | string (string) |  | Yes |

#### WalletDTO

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| name | string (string) |  | Yes |
