## Getting Started (updated at: 25-11-22)

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

### Person

| Method | Url                                         | Description          |
|--------|---------------------------------------------|----------------------|
| GET    | http://localhost:8082/api/person            | Get all person       |
| POST   | http://localhost:8082/api/person            | Create/Update person |
| GET    | http://localhost:8082/api/person/{id}       | Get person by id     |
| DELETE | http://localhost:8082/api/person/{id}       | Delete person by id  |

---

Add Person Example:
```json
{
    "name": "Cristian Quinto",
    "age": 28,
    "degree": "Jr Full Stack Developer",
    "email": "cristianquinto@gmail.com",
    "summary": "This is a simple example of my summary.",
    "image": {
        "path": "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
    },
    "phones": [
        {
            "type": "Mobile",
            "number": "+54 9 2644558963"
        },
        {
            "type": "House",
            "number": "+54 9 2646897412"
        }
    ]
}
```

Edit Person Example:
```json
{
    "id": 1,
    "name": "Pepe Honguito",
    "age": 30,
    "degree": "Sr Full Stack Developer",
    "email": "pepehonguito@gmail.com",
    "summary": "This is another example of summary.",
    "image": {
        "id": 1,
        "path": "https://ui-avatars.com/api/?name=Pepe+Honguito&size=255"
    },
    "phones": [
        {
            "id": 1,
            "type": "Work",
            "number": "+54 9 2645254407"
        },
        {
            "id": 2,
            "type": "House",
            "number": "+54 9 2646897412"
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