# spring-boot-rest
# Spring Boot Rest DATA
 - It will expose Entity CRUD endpoint for free based on provided entity with pluralized form

> [!NOTE]
Sample Response
1. Get /employees
```json
{
  "_embedded": {
    "employees": [
      {
        "firstName": "Avani",
        "lastName": "Gupta",
        "email": "avani@luv2code.com",
        "_links": {
          "self": {
            "href": "http://localhost:8080/employees/3"
          },
          "employee": {
            "href": "http://localhost:8080/employees/3"
          }
        }
      },
      {
        "firstName": "Juan",
        "lastName": "Vega",
        "email": "juan@luv2code.com",
        "_links": {
          "self": {
            "href": "http://localhost:8080/employees/5"
          },
          "employee": {
            "href": "http://localhost:8080/employees/5"
          }
        }
      },
      {
        "firstName": "Cho",
        "lastName": "Cho",
        "email": "chohtet@luv2code.com",
        "_links": {
          "self": {
            "href": "http://localhost:8080/employees/8"
          },
          "employee": {
            "href": "http://localhost:8080/employees/8"
          }
        }
      }
    ]
  },
  "_links": {
    "self": {
      "href": "http://localhost:8080/employees?page=0&size=20"
    },
    "profile": {
      "href": "http://localhost:8080/profile/employees"
    }
  },
  "page": {
    "size": 20,
    "totalElements": 4,
    "totalPages": 1,
    "number": 0
  }
}
```
2. Put employees/1
```json
{
    "firstName": "Hello",
    "lastName": "Andrews",
    "email": "leslie@luv2code.com",
    "_links": {
        "self": {
            "href": "http://localhost:8080/magic-api/employees/1"
        },
        "employee": {
            "href": "http://localhost:8080/magic-api/employees/1"
        }
    }
}
```
> [!NOTE] 
Customized spring data path
- By configure properties file
`spring.data.rest.base-path=/magic-api`

