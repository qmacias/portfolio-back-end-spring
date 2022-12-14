package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "type", "number"})
public class PhoneDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("number")
    private String number;

    private PhoneDto() {
        this.id = "";
        this.type = "";
        this.number = "";
    }

    private PhoneDto(String id, String type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public static PhoneDto of(String id, String type, String number) {
        return new PhoneDto(id, type, number);
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

}
