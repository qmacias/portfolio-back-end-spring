## Getting Started (updated at: 14-12-22)

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
    "birthdate": "03/10/1994",
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
    ],
    "jobs": [
        {
            "position": "Java Developer",
            "description": "Lorem ipsum dolor sit amet consectetur adipisicing elit.",
            "duration": {
                "start_date": "15/10/2022",
                "finish_date": "20/12/2022"
            },
            "achievements": [
                {
                    "description": "Lorem ipsum dolor sit amet, 80% consectetuer adipiscing elit."
                },
                {
                    "description": "Lorem ipsum dolor sit amet, 10% consectetuer adipiscing elit."
                },
                {
                    "description": "Lorem ipsum dolor sit amet, 10% consectetuer adipiscing elit."
                }
            ]
        }
    ]
}
```

Edit Person:
```json
{
    "id": "3bb55f87-3aa2-46f7-8d95-f5c0b69b453a",
    "name": "Cristian Quinto",
    "birthdate": "03/10/1994",
    "degree": "Jr Full Stack Developer",
    "email": "ezequielqmacias@gmail.com",
    "summary": "This is a simple example of my summary.",
    "image": {
        "id": "5ab0d331-220c-4a6c-9e41-f664fab1b324",
        "path": "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
    },
    "phones": [
        {
            "id": "36e7eecb-9abb-41e4-8210-66e99ea1fc05",
            "type": "House",
            "number": "+54 9 2644216760"
        },
        {
            "id": "b2e5c5fb-f58f-4169-8a1c-c94d774e4c4b",
            "type": "Mobile",
            "number": "+54 9 2646269903"
        }
    ],
    "address": [
        {
            "id": "4dd65642-8dca-4e57-9803-9bd8ba01b1cb",
            "type": "House",
            "description": "Calle Asunción 36 Norte"
        },
        {
            "id": "2c4fee1d-48f5-43af-b309-cf8a772fed39",
            "type": "Work",
            "description": "Av. Libertador 526 Oeste"
        }
    ],
    "social": [
        {
            "id": "5bc03f5e-01f2-490c-933c-8bc7b1c915c0",
            "link": "https://www.instagram.com/cqube.argentina"
        },
        {
            "id": "2e2a954c-5d8d-41ea-a5a4-09acfaab4283",
            "link": "https://www.instagram.com/cristian.quinto.m"
        }
    ],
    "jobs": [
        {
            "id": "706dac67-d37a-4ba6-a4cb-66716c9836dd",
            "position": "Java Developer",
            "description": "Lorem ipsum dolor sit amet consectetur adipisicing elit.",
            "duration": {
                "id": "ce0b5406-f0f6-4582-b2dc-fb8eaa87b62d",
                "start_date": "15/10/2022",
                "finish_date": "20/12/2022"
            },
            "achievements": [
                {
                    "id": "27c41b34-bc19-40ce-baf7-677369b90a77",
                    "description": "Lorem ipsum dolor sit amet, 10% consectetuer adipiscing elit."
                },
                {
                    "id": "9792a6cb-3c90-47f4-bd24-862100927d84",
                    "description": "Lorem ipsum dolor sit amet, 80% consectetuer adipiscing elit."
                },
                {
                    "id": "47cfa889-e7a3-41e6-a3db-44a330913d10",
                    "description": "Lorem ipsum dolor sit amet, 10% consectetuer adipiscing elit."
                }
            ]
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