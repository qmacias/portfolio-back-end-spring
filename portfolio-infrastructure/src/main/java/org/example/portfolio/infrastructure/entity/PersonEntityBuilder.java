package org.example.portfolio.infrastructure.entity;

import java.util.List;

public class PersonEntityBuilder extends PersonEntity {

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

    public PersonEntityBuilder setPhoneEntities(List<PhoneEntity> phoneEntities) {
        this.phoneEntities = phoneEntities;
        return this;
    }

    public PersonEntityBuilder setAddressEntities(List<AddressEntity> addressEntities) {
        this.addressEntities = addressEntities;
        return this;
    }

    public PersonEntityBuilder setSocialEntities(List<SocialEntity> socialEntities) {
        this.socialEntities = socialEntities;
        return this;
    }

    public PersonEntity createPersonEntity() {
        return new PersonEntity(id, name, age, degree, email, summary, imageEntity, phoneEntities, addressEntities, socialEntities);
    }

}