package org.example.portfolio.infrastructure.entity;

import java.util.Set;

import java.io.Serializable;

public class PersonEntityBuilder implements Serializable {

    private String id;

    private String name;

    private String birthdate;

    private String degree;

    private String email;

    private String summary;

    private ImageEntity imageEntity;

    private Set<PhoneEntity> phoneEntities;

    private Set<AddressEntity> addressEntities;

    private Set<SocialEntity> socialEntities;

    private Set<JobEntity> jobEntities;

    private PersonEntityBuilder() {
        super();
    }

    public static PersonEntityBuilder builder() {
        return new PersonEntityBuilder();
    }

    public PersonEntityBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PersonEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonEntityBuilder setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public PersonEntityBuilder setPhoneEntities(Set<PhoneEntity> phoneEntities) {
        this.phoneEntities = phoneEntities;
        return this;
    }

    public PersonEntityBuilder setAddressEntities(Set<AddressEntity> addressEntities) {
        this.addressEntities = addressEntities;
        return this;
    }

    public PersonEntityBuilder setSocialEntities(Set<SocialEntity> socialEntities) {
        this.socialEntities = socialEntities;
        return this;
    }

    public PersonEntityBuilder setJobEntities(Set<JobEntity> jobEntities) {
        this.jobEntities = jobEntities;
        return this;
    }

    public PersonEntity build() {
        return new PersonEntity(id, name, birthdate, degree, email, summary, imageEntity,
                phoneEntities, addressEntities, socialEntities, jobEntities
        );
    }

}