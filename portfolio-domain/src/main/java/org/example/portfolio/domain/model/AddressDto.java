package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "type", "description"})
public class AddressDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("description")
    private String description;

    AddressDto() {
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
