## Getting Started (updated at: 27-11-22)

### Installation
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
    "phoneList": [
        {
            "type": "Mobile",
            "number": "+54 9 2646269903"
        },
        {
            "type": "House",
            "number": "+54 9 2644216760"
        }
    ],
    "addressList": [
        {
            "type": "Work",
            "description": "Av. Libertador 526 Oeste"
        },
        {
            "type": "House",
            "description": "Calle Asunción 36 Norte"
        }
    ]
}
```

Edit Person:
```json
{
    "id": "4ff8dd3a-2229-48ad-a3c8-c232407ea3cc",
    "name": "Pepe Honguito",
    "age": 30,
    "degree": "Sr Full Stack Developer",
    "email": "pepehonguito@gmail.com",
    "summary": "This is another example of summary.",
    "image": {
        "id": "c4ba289c-9b76-4af7-a2be-30dcf40d95b5",
        "path": "https://ui-avatars.com/api/?name=Pepe+Honguito&size=255"
    },
    "phoneList": [
        {
            "id": "37b90918-8163-4278-8de2-391dfbf48942",
            "type": "Work",
            "number": "+54 9 2646269904"
        },
        {
            "id": "e6dddd24-764e-4df8-93fe-bfed6a3ad748",
            "type": "Gym",
            "number": "+54 9 2644216761"
        }
    ],
    "addressList": [
        {
            "id": "637a0cfa-eee3-410f-9c2a-e1b169c1d9f1",
            "type": "Other",
            "description": "Av. Ign. De La Rosa, entre Rivadavia y Córdoba"
        }
    ]
}
```
---

### Reference Documentation
For further reference, please consider the following sections:

- [Hexagonal Architecture](https://alistair.cockburn.us/hexagonal-architecture/)
- [Ports And Adapters Architecture Explained](https://codesoapbox.dev/ports-adapters-aka-hexagonal-architecture-explained/)
- [What Is Hexagonal Architecture? Why Should You Use It?](https://cardoai.com/what-is-hexagonal-architecture-should-you-use-it/)