## New Spring Test Stage (25-11-22)

### Installation
```console
mvn clean install
```
### Run Project
```console
mvn -pl portfolio-launcher -am spring-boot:run
```
### H2 Console
```
http://localhost:8082/h2-console
```
### API Endpoints

### Person

| Method | Url                                         | Description          |
|--------|---------------------------------------------|----------------------|
| GET    | http://localhost:8082/api/person            | Get all person       |
| POST   | http://localhost:8082/api/person            | Create/Update person |
| GET    | http://localhost:8082/api/person/{id}       | Get person by id     |
| DELETE | http://localhost:8082/api/person/{id}       | Delete person by id  |

---

### Reference Documentation
For further reference, please consider the following sections:

- [Hexagonal Architecture](https://alistair.cockburn.us/hexagonal-architecture/)
- [Ports And Adapters Architecture Explained](https://codesoapbox.dev/ports-adapters-aka-hexagonal-architecture-explained/)
- [What Is Hexagonal Architecture? Why Should You Use It?](https://cardoai.com/what-is-hexagonal-architecture-should-you-use-it/)