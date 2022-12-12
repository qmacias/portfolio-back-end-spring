package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDto {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    protected String id;

    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    protected String name;

    @lombok.Getter(onMethod_ = {@JsonProperty("age")})
    protected Integer age;

    @lombok.Getter(onMethod_ = {@JsonProperty("degree")})
    protected String degree;

    @lombok.Getter(onMethod_ = {@JsonProperty("email")})
    protected String email;

    @lombok.Getter(onMethod_ = {@JsonProperty("summary")})
    protected String summary;

    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    protected ImageDto imageDto;

    @lombok.Getter(onMethod_ = {@JsonProperty("phones")})
    protected List<PhoneDto> phoneDtoList;

    @lombok.Getter(onMethod_ = {@JsonProperty("address")})
    protected List<AddressDto> addressDtoList;

    @lombok.Getter(onMethod_ = {@JsonProperty("social")})
    protected List<SocialDto> socialDtoList;

    @lombok.Getter(onMethod_ = {@JsonProperty("jobs")})
    protected List<JobDto> jobDtoList;

    PersonDto() {
    }

    protected PersonDto(
            String id,
            String name,
            Integer age,
            String degree,
            String email,
            String summary,
            ImageDto imageDto,
            List<PhoneDto> phoneDtoList,
            List<AddressDto> addressDtoList,
            List<SocialDto> socialDtoList,
            List<JobDto> jobDtoList
    ) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageDto = imageDto;
        this.phoneDtoList = phoneDtoList;
        this.addressDtoList = addressDtoList;
        this.socialDtoList = socialDtoList;
        this.jobDtoList = jobDtoList;
    }

}
