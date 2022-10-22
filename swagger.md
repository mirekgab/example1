---
title: TrackExpensensApp v0.2.1
language_tabs: []
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="trackexpensensapp">TrackExpensensApp v0.2.1</h1>

> Scroll down for example requests and responses.

Hello world

<h1 id="trackexpensensapp-wallet">wallet</h1>

## getAllWallets

<a id="opIdgetAllWallets"></a>

> Code samples

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
  "name": "WalletName",
  "creationDate": "2022-10-22T09:47:52.595721658Z"
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
  "name": "WalletName",
  "creationDate": "2022-10-22T09:47:52.595721658Z"
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

