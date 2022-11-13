# Getting Started (Spring Test)

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

| Method | Url                                         | Description         |
|--------|---------------------------------------------|---------------------|
| GET    | http://localhost:8082/api/person            | Get all person      |
| POST   | http://localhost:8082/api/person            | Create new person   |
| GET    | http://localhost:8082/api/person/{id}       | Get person by id    |
| DELETE | http://localhost:8082/api/person/{id}       | Delete person by id |
| PUT    | http://localhost:8082/api/person/1/images/1 | Add image to person |

### Images

| Method | Url                                         | Description        |
|--------|---------------------------------------------|--------------------|
| GET    | http://localhost:8082/api/images            | Get all images     |
| POST   | http://localhost:8082/api/images            | Create new image   |
| GET    | http://localhost:8082/api/images/{id}       | Get image by id    |
| DELETE | http://localhost:8082/api/images/{id}       | Delete image by id |

---

### Reference Documentation
For further reference, please consider the following sections:

- [Hexagonal Architecture](https://alistair.cockburn.us/hexagonal-architecture/)
- [What is it and why should you use it?](https://cardoai.com/what-is-hexagonal-architecture-should-you-use-it/)