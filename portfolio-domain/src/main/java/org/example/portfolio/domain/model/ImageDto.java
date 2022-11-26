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
public class ImageDto {

    private String id;

    private String path;

    protected ImageDto() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public ImageDto(String id, String path) {
        this();
        this.id = id;
        this.path = path;
    }

}
