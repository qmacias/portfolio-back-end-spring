package org.example.portfolio.domain.model;

import java.util.List;

public class PersonDtoBuilder extends PersonDto {

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

    public PersonDtoBuilder setImageDto(ImageDto imageDto) {
        this.imageDto = imageDto;
        return this;
    }

    public PersonDtoBuilder setPhoneDtoList(List<PhoneDto> phoneDtoList) {
        this.phoneDtoList = phoneDtoList;
        return this;
    }

    public PersonDtoBuilder setAddressDtoList(List<AddressDto> addressDtoList) {
        this.addressDtoList = addressDtoList;
        return this;
    }

    public PersonDtoBuilder setSocialDtoList(List<SocialDto> socialDtoList) {
        this.socialDtoList = socialDtoList;
        return this;
    }

    public PersonDtoBuilder setJobDtoList(List<JobDto> jobDtoList) {
        this.jobDtoList = jobDtoList;
        return this;
    }

    public PersonDto createPersonDto() {
        return new PersonDto(id, name, age, degree, email, summary, imageDto,
                phoneDtoList, addressDtoList, socialDtoList, jobDtoList
        );
    }

}