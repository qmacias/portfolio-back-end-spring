package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class PersonDto {

    private String id;

    private String name;

    private Integer age;

    private String degree;

    @EqualsAndHashCode.Include
    private String email;

    private String summary;

    private ImageDto image;

    private List<PhoneDto> phones;

    protected PersonDto() {
        super();
        this.id = UUID.randomUUID().toString();
        this.image = new ImageDto();
        this.phones = new ArrayList<>();
    }

    public PersonDto(
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
        phones.add(phoneDto);
    }

    public void removePhoneDto(PhoneDto phoneDto) {
        if (phones != null) {
            phones.remove(phoneDto);
        }
    }

}
