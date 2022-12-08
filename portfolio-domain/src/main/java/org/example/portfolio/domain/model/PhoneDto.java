package org.example.portfolio.domain.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhoneDto {

    private String id;

    private String type;

    private String number;

    PhoneDto() {
        this.id = UUID.randomUUID().toString();
    }

    private PhoneDto(String id, String type, String number) {
        this();
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
