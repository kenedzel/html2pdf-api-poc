# Sample HTML to PDF

## Endpoint: /submit-data

### Description
This endpoint accepts JSON data containing dummy data in place of the placeholders in a thymeleaf templated HTML.
### Request

- **URL**
    - `/convert`

- **Method**
    - `POST`

- **Headers**
    - `Content-Type: application/json`

- **Request Body**
  ```json
  {
      "name": "John Doe",
      "emailAddress": "john@doe.com",
      "extra": "extra"
  }

### Response

- **204 No Content**