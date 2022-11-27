package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class AddressDto {

    private String id;

    private String type;

    private String description;

    protected AddressDto() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public AddressDto(String id, String type, String description) {
        this();
        this.id = id;
        this.type = type;
        this.description = description;
    }

}
