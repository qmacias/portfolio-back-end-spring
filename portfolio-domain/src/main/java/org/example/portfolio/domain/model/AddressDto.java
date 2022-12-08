package org.example.portfolio.domain.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {

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

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

}
