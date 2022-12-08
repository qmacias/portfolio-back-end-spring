package org.example.portfolio.infrastructure.entity;

public class PersonEntityBuilder {

    private String id;

    private String name;

    private Integer age;

    private String degree;

    private String email;

    private String summary;

    private ImageEntity imageEntity;

    public PersonEntityBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PersonEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonEntityBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonEntityBuilder setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public PersonEntityBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonEntityBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public PersonEntityBuilder setImageEntity(ImageEntity imageEntity) {
        this.imageEntity = imageEntity;
        return this;
    }

    public PersonEntity createPersonEntity() {
        return new PersonEntity(id, name, age, degree, email, summary, imageEntity);
    }

}