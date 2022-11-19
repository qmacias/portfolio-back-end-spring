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
public class ImageDto {

    private Long id;

    private String path;

    protected ImageDto() {
        super();
    }

    public ImageDto(Long id, String path) {
        this();
        this.id = id;
        this.path = path;
    }

}
