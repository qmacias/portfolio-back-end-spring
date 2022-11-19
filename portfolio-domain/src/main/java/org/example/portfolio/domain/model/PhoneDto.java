package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class PhoneDto {

    private Long id;

    private String type;

    private String number;

    protected PhoneDto() {
        super();
    }

    public PhoneDto(Long id, String type, String number) {
        this();
        this.id = id;
        this.type = type;
        this.number = number;
    }

}
