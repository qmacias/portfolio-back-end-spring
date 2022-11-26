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
public class PhoneDto {

    private String id;

    private String type;

    private String number;

    protected PhoneDto() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public PhoneDto(String id, String type, String number) {
        this();
        this.id = id;
        this.type = type;
        this.number = number;
    }

}
