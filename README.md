## Getting Started (updated at: 10-12-22)

### Clone Repository
```console
git clone https://github.com/qmacias/portfolio-back-end-spring.git
```
---
### Install Dependencies
```console
mvn clean install
```
---
### Run Project
```console
mvn -pl portfolio-launcher -am spring-boot:run
```
---
### H2 Console
```
http://localhost:8082/h2-console
```
---
### API Endpoints

| Method | Url                                         | Description          |
|--------|---------------------------------------------|----------------------|
| GET    | http://localhost:8082/api/person            | Get all person       |
| POST   | http://localhost:8082/api/person            | Create/Update person |
| GET    | http://localhost:8082/api/person/{id}       | Get person by id     |
| DELETE | http://localhost:8082/api/person/{id}       | Delete person by id  |

---
### Postman Examples

Add Person:
```json
{
    "name": "Cristian Quinto",
    "age": 28,
    "degree": "Jr Full Stack Developer",
    "email": "ezequielqmacias@gmail.com",
    "summary": "This is a simple example of my summary.",
    "image": {
        "path": "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
    },
    "phones": [
        {
            "type": "Mobile",
            "number": "+54 9 2646269903"
        },
        {
            "type": "House",
            "number": "+54 9 2644216760"
        }
    ],
    "address": [
        {
            "type": "Work",
            "description": "Av. Libertador 526 Oeste"
        },
        {
            "type": "House",
            "description": "Calle Asunción 36 Norte"
        }
    ],
    "social": [
        {
            "link": "https://www.instagram.com/cqube.argentina"
        },
        {
            "link": "https://www.instagram.com/cristian.quinto.m"
        }
    ]
}
```

Edit Person:
```json
{
    "id": "3049d9ae-9ca4-403c-bed8-7a058e0e300c",
    "name": "Pepe Honguito",
    "age": 30,
    "degree": "Sr Full Stack Developer",
    "email": "pepehonguito@gmail.com",
    "summary": "This is another example of summary.",
    "image": {
        "id": "a7ebfd26-c18c-4585-8818-8446d857381a",
        "path": "https://ui-avatars.com/api/?name=Pepe+Honguito&size=255"
    },
    "phones": [
        {
            "id": "9802de07-4a6a-475d-9bb8-d970de5ce375",
            "type": "Work",
            "number": "+54 9 2646269904"
        },
        {
            "id": "f958afb8-c6a1-4055-83b7-a1fecaf0fa37",
            "type": "Gym",
            "number": "+54 9 2644216761"
        }
    ],
    "address": [
        {
            "id": "1c1916f9-7700-45e2-bea1-c19d5e48c3b0",
            "type": "Other",
            "description": "Av. Ign. De La Rosa, entre Rivadavia y Córdoba"
        }
    ],
    "social": []
}
```
---

### Reference Documentation
For further reference, please consider the following sections:

- [Hexagonal Architecture](https://alistair.cockburn.us/hexagonal-architecture/)
- [Ports And Adapters Architecture Explained](https://codesoapbox.dev/ports-adapters-aka-hexagonal-architecture-explained/)
- [What Is Hexagonal Architecture? Why Should You Use It?](https://cardoai.com/what-is-hexagonal-architecture-should-you-use-it/)