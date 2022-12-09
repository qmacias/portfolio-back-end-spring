package org.example.portfolio.domain.model;

import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

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

    @JsonProperty("phones")
    private final List<PhoneDto> phoneList = Lists.newArrayList();

    @JsonProperty("address")
    private final List<AddressDto> addressList = Lists.newArrayList();

    @JsonProperty("social")
    private final List<SocialDto> socialList = Lists.newArrayList();

    PersonDto() {
        this.id = UUID.randomUUID().toString();
    }

    protected PersonDto(
            String id,
            String name,
            Integer age,
            String degree,
            String email,
            String summary,
            ImageDto imageDto
    ) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageDto = imageDto;
    }

    public void addPhoneDto(PhoneDto phoneDto) {
        phoneList.add(phoneDto);
    }

    public void addAddressDto(AddressDto addressDto) {
        addressList.add(addressDto);
    }

    public void addSocialDto(SocialDto socialDto) {
        socialList.add(socialDto);
    }

    public List<PhoneDto> getPhoneList() {
        return ImmutableList.copyOf(phoneList);
    }

    public List<AddressDto> getAddressList() {
        return ImmutableList.copyOf(addressList);
    }

    public List<SocialDto> getSocialList() {
        return ImmutableList.copyOf(socialList);
    }

}
