package org.example.portfolio.domain.model;

import lombok.Getter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDto {

    protected String id;

    protected String name;

    protected Integer age;

    protected String degree;

    protected String email;

    protected String summary;

    protected ImageDto image;

    private final List<PhoneDto> phoneList = new ArrayList<>();

    private final List<AddressDto> addressList = new ArrayList<>();

    private final List<SocialDto> socialList = new ArrayList<>();

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
            ImageDto image
    ) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.image = image;
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

}
