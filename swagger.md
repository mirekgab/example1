# Track Expenses App
Open Source project for create simple web app to track expenses and incomes

## Version: 0.2.1

### Terms of service
<http://swagger.io/terms/>

**Contact information:**  
apiteam@swagger.io  

**License:** [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

[Find out more about Swagger](http://swagger.io)
### /pet

#### POST
##### Summary

Add a new pet to the store

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| CreatedWalletDTO | body | Wallet data | Yes | [CreateWalletDTO](#createwalletdto) |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Walet created successfully |
| 405 | Invalid input |

#### PUT
##### Summary

Update an existing pet

##### Description

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| body | body | Pet object that needs to be added to the store | Yes | [Pet](#pet) |

##### Responses

| Code | Description |
| ---- | ----------- |
| 400 | Invalid ID supplied |
| 404 | Pet not found |
| 405 | Validation exception |

### /pet/{petId}

#### GET
##### Summary

Find pet by ID

##### Description

Returns a single pet

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| petId | path | ID of pet to return | Yes | long |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | successful operation | [Pet](#pet) |
| 400 | Invalid ID supplied |  |
| 404 | Pet not found |  |

##### Security

| Security Schema | Scopes |
| --- | --- |
| api_key | |

#### POST
##### Summary

Updates a pet in the store with form data

##### Description

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| petId | path | ID of pet that needs to be updated | Yes | long |
| name | formData | Updated name of the pet | No | string |
| status | formData | Updated status of the pet | No | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 405 | Invalid input |

##### Security

| Security Schema | Scopes | |
| --- | --- | --- |
| petstore_auth | write:pets | read:pets |

#### DELETE
##### Summary

Deletes a pet

##### Description

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| api_key | header |  | No | string |
| petId | path | Pet id to delete | Yes | long |

##### Responses

| Code | Description |
| ---- | ----------- |
| 400 | Invalid ID supplied |
| 404 | Pet not found |

### Models

#### Order

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| petId | long |  | No |
| quantity | integer |  | No |
| shipDate | dateTime |  | No |
| status | string | Order Status<br>_Enum:_ `"placed"`, `"approved"`, `"delivered"` | No |
| complete | boolean |  | No |

#### Category

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| name | string |  | No |

#### User

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| username | string |  | No |
| firstName | string |  | No |
| lastName | string |  | No |
| email | string |  | No |
| password | string |  | No |
| phone | string |  | No |
| userStatus | integer | User Status | No |

#### Tag

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| name | string |  | No |

#### CreateWalletDTO

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | Long |  | No |
| name | string | _Example:_ `"wallet-name"` | Yes |

#### Pet

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | long |  | No |
| category | [Category](#category) |  | No |
| name | string | _Example:_ `"doggie"` | Yes |
| photoUrls | [ string ] |  | Yes |
| tags | [ [Tag](#tag) ] |  | No |
| status | string | pet status in the store<br>_Enum:_ `"available"`, `"pending"`, `"sold"` | No |

#### ApiResponse

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| code | integer |  | No |
| type | string |  | No |
| message | string |  | No |
