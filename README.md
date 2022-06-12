#Application de paiement avec une architeture micro-services et redis

Briand Thibaud
David-Heanri Arnaud

## La base de l'application OpenAPI
### Les routes
L'application a été généré grâce a Swagger. Le fichier .yaml est disponible dans le dépôt.
L'application est composer d'un controller PaymentApiController.java
Dans lequel se trouve 3 routes: GetAll() et paymentCreate()
- PaymentCreate() est la fonction dans lequel se trouve la logique de payment de l'api.
- GetAll() qui retourne tous les payment

L'openApi comporte une route post /Payment qu'il faut utiliser avec un format Jison de request de ce type:
```{
  "buyer_info": {
    "id": 0,
    "name": "string"
  },
  "checkout_id": "f8a8c8e7-b8b6-4b8b-8b8b-8b8b8b8b8b8b",
  "credit_card_info": "string",
  "payment_orders": [
    {
      "seller_account": "string",
      "amount": 0,
      "currency": "stri",
      "payment_order_id": 0
    }
  ]
}
```
Et qui a pour réponse:
```
{
  "payment_status": "success",
  "checkout_id": 0
}
```
 et pour retour d'erreur:
```
{
  "payment_status": "failure",
  "checkout_id": "f9a8d8a0-c8b9-4b1a-b1a1-f9a8d8a0c8b9"
}
```
L'api de paiment possède aussi un getAll qui permet de récupéré tous les payment réalisé avec succès eet qui retourne une réponse
de cette form:
```
[
  {
    "buyer_info": {
      "id": 0,
      "name": "string"
    },
    "checkout_id": "f8a8c8e7-b8b6-4b8b-8b8b-8b8b8b8b8b8b",
    "credit_card_info": "string",
    "payment_orders": [
      {
        "seller_account": "string",
        "amount": 0,
        "currency": "stri",
        "payment_order_id": 0
      }
    ]
  }
]
```

### Les Schémas
#### 1 BuyerInfo
```
BuyerInfo{
id    integer($id)
name    string
 
}
```
#### 2 PaymentOrder
```
PaymentOrder{
seller_account    string
amount    number($double)
currency    string
minLength: 3
maxLength: 4
Currency of the amount respecting ISO 4217

payment_order_id    integer($id)
 
}
```
#### 3 Payment
```
Payment{
buyer_info    BuyerInfo{...}Jump to definition
checkout_id    string($uuid)
example: f8a8c8e7-b8b6-4b8b-8b8b-8b8b8b8b8b8b
credit_card_info    string
credit card information.

payment_orders    [...]
 
}
```

#### 4 Enum PaymentStatus
```
PaymentStatus
string Enum:
[ success, failure ]
```

#### 5 PaymentResponse
```
PaymentResponse{
payment_status    PaymentStatusstring
Enum:
Array [ 2 ]
checkout_id    integer($id)
 
}
```

## Précision
Nous avons esséyer de mettre en place un dockerfile et un docker-compose mais il ne fonctionne pas et nous ne savons pas pouquoi mais nous l'avons quand meme mis dans le dépôt.