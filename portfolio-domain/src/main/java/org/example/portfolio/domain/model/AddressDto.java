package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class AddressDto implements Serializable {

    private String id;

    private String type;

    private String description;

    AddressDto() {
        this.id = UUID.randomUUID().toString();
    }

    private AddressDto(String id, String type, String description) {
        this();
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public static AddressDto of(String id, String type, String description) {
        return new AddressDto(id, type, description);
    }

}
