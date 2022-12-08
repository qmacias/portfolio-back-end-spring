package org.example.portfolio.domain.model;

public class PersonDtoBuilder {

    private String id;

    private String name;

    private Integer age;

    private String degree;

    private String email;

    private String summary;

    private ImageDto image;

    public PersonDtoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PersonDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonDtoBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonDtoBuilder setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public PersonDtoBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonDtoBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public PersonDtoBuilder setImage(ImageDto image) {
        this.image = image;
        return this;
    }

    public PersonDto createPersonDto() {
        return new PersonDto(id, name, age, degree, email, summary, image);
    }
}