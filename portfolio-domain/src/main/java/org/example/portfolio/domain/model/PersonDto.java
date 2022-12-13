package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "name", "birthdate", "degree", "email", "summary",
        "image", "phones", "address", "social", "jobs"})
public class PersonDto {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    protected String id;

    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    protected String name;

    @lombok.Getter(onMethod_ = {@JsonProperty("birthdate")})
    protected String birthdate;

    @lombok.Getter(onMethod_ = {@JsonProperty("degree")})
    protected String degree;

    @lombok.Getter(onMethod_ = {@JsonProperty("email")})
    protected String email;

    @lombok.Getter(onMethod_ = {@JsonProperty("summary")})
    protected String summary;

    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    protected ImageDto imageDto;

    @lombok.Getter(onMethod_ = {@JsonProperty("phones")})
    protected Set<PhoneDto> phoneDtoSet;

    @lombok.Getter(onMethod_ = {@JsonProperty("address")})
    protected Set<AddressDto> addressDtoSet;

    @lombok.Getter(onMethod_ = {@JsonProperty("social")})
    protected Set<SocialDto> socialDtoSet;

    @lombok.Getter(onMethod_ = {@JsonProperty("jobs")})
    protected Set<JobDto> jobDtoSet;

    PersonDto() {
    }

    protected PersonDto(
            String id,
            String name,
            String birthdate,
            String degree,
            String email,
            String summary,
            ImageDto imageDto,
            Set<PhoneDto> phoneDtoSet,
            Set<AddressDto> addressDtoSet,
            Set<SocialDto> socialDtoSet,
            Set<JobDto> jobDtoSet
    ) {
        this();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageDto = imageDto;
        this.phoneDtoSet = phoneDtoSet;
        this.addressDtoSet = addressDtoSet;
        this.socialDtoSet = socialDtoSet;
        this.jobDtoSet = jobDtoSet;
    }

}
