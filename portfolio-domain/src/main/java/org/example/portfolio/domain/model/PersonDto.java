package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "name", "birthdate", "degree", "email", "summary",
        "image", "phones", "address", "social", "jobs"})
public class PersonDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("degree")
    private String degree;

    @JsonProperty("email")
    private String email;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("image")
    private ImageDto imageDto;

    @JsonProperty("phones")
    private Set<PhoneDto> phoneDtoSet;

    @JsonProperty("address")
    private Set<AddressDto> addressDtoSet;

    @JsonProperty("social")
    private Set<SocialDto> socialDtoSet;

    @JsonProperty("jobs")
    private Set<JobDto> jobDtoSet;

    private PersonDto() {
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

    PersonDto(
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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDegree() {
        return degree;
    }

    public String getEmail() {
        return email;
    }

    public String getSummary() {
        return summary;
    }

    public ImageDto getImageDto() {
        return imageDto;
    }

    public Set<PhoneDto> getPhoneDtoSet() {
        return phoneDtoSet;
    }

    public Set<AddressDto> getAddressDtoSet() {
        return addressDtoSet;
    }

    public Set<SocialDto> getSocialDtoSet() {
        return socialDtoSet;
    }

    public Set<JobDto> getJobDtoSet() {
        return jobDtoSet;
    }

}
