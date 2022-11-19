package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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

    public PhoneDto(Long id, String type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

}
