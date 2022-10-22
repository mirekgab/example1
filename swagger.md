---
title: TrackExpensensApp v0.2.1
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="trackexpensensapp">TrackExpensensApp v0.2.1</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

Hello world

<h1 id="trackexpensensapp-wallet">wallet</h1>

## getAllWallets

<a id="opIdgetAllWallets"></a>

> Code samples

```shell
# You can also use wget
curl -X GET /api/wallet \
  -H 'Accept: application:json'

```

```http
GET /api/wallet HTTP/1.1

Accept: application:json

```

```javascript

const headers = {
  'Accept':'application:json'
};

fetch('/api/wallet',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application:json'
}

result = RestClient.get '/api/wallet',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application:json'
}

r = requests.get('/api/wallet', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application:json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','/api/wallet', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("/api/wallet");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application:json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "/api/wallet", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /api/wallet`

*get all wallets*

provides information about all wallets

> Example responses

> 200 Response

<h3 id="getallwallets-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|successful operation|Inline|

<h3 id="getallwallets-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[WalletDTO](#schemawalletdto)]|false|none|none|
|» id|integer(int64)|false|none|none|
|» name|string(string)|false|none|none|
|» creationDate|string(date-time)|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## post__api_wallet

> Code samples

```shell
# You can also use wget
curl -X POST /api/wallet \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
POST /api/wallet HTTP/1.1

Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
  "name": "string"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('/api/wallet',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.post '/api/wallet',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.post('/api/wallet', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','/api/wallet', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("/api/wallet");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "/api/wallet", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /api/wallet`

*create new wallet*

create new wallet with given names

> Body parameter

```json
{
  "name": "string"
}
```

<h3 id="post__api_wallet-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[CreateWalletDTO](#schemacreatewalletdto)|false|create new wallet|

> Example responses

> 200 Response

```json
{
  "id": 1,
  "name": "wallet-name",
  "creationDate": "2022-01-01 12:32.23"
}
```

<h3 id="post__api_wallet-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|successful operation|[WalletDTO](#schemawalletdto)|
|405|[Method Not Allowed](https://tools.ietf.org/html/rfc7231#section-6.5.5)|invalid input data|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_WalletDTO">WalletDTO</h2>
<!-- backwards compatibility -->
<a id="schemawalletdto"></a>
<a id="schema_WalletDTO"></a>
<a id="tocSwalletdto"></a>
<a id="tocswalletdto"></a>

```json
{
  "id": 1,
  "name": "wallet-name",
  "creationDate": "2022-01-01 12:32.23"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int64)|false|none|none|
|name|string(string)|false|none|none|
|creationDate|string(date-time)|false|none|none|

<h2 id="tocS_CreateWalletDTO">CreateWalletDTO</h2>
<!-- backwards compatibility -->
<a id="schemacreatewalletdto"></a>
<a id="schema_CreateWalletDTO"></a>
<a id="tocScreatewalletdto"></a>
<a id="tocscreatewalletdto"></a>

```json
{
  "name": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|name|string(string)|false|none|none|

