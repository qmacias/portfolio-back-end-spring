package org.example.portfolio.domain.model;

import java.util.Set;

public class PersonDtoBuilder {

    private String id;

    private String name;

    private String birthdate;

    private String degree;

    private String email;

    private String summary;

    private ImageDto imageDto;

    private Set<PhoneDto> phoneDtoSet;

    private Set<AddressDto> addressDtoSet;

    private Set<SocialDto> socialDtoSet;

    private Set<JobDto> jobDtoSet;

    private PersonDtoBuilder() {
        this.id = "";
        this.name = "";
        this.birthdate = "";
        this.degree = "";
        this.email = "";
        this.summary = "";
        this.imageDto = null;
        this.phoneDtoSet = null;
        this.addressDtoSet = null;
        this.socialDtoSet = null;
        this.jobDtoSet = null;
    }

    public static PersonDtoBuilder builder() {
        return new PersonDtoBuilder();
    }

    public PersonDtoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PersonDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonDtoBuilder setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public PersonDtoBuilder setImageDto(ImageDto imageDto) {
        this.imageDto = imageDto;
        return this;
    }

    public PersonDtoBuilder setPhoneDtoSet(Set<PhoneDto> phoneDtoSet) {
        this.phoneDtoSet = phoneDtoSet;
        return this;
    }

    public PersonDtoBuilder setAddressDtoSet(Set<AddressDto> addressDtoSet) {
        this.addressDtoSet = addressDtoSet;
        return this;
    }

    public PersonDtoBuilder setSocialDtoSet(Set<SocialDto> socialDtoSet) {
        this.socialDtoSet = socialDtoSet;
        return this;
    }

    public PersonDtoBuilder setJobDtoSet(Set<JobDto> jobDtoSet) {
        this.jobDtoSet = jobDtoSet;
        return this;
    }

    public PersonDto build() {
        return new PersonDto(id, name, birthdate, degree, email, summary, imageDto,
                phoneDtoSet, addressDtoSet, socialDtoSet, jobDtoSet
        );
    }

}