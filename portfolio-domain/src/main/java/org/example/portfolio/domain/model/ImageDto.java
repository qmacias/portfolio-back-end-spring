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
public class ImageDto implements Serializable {

    private String id;

    private String path;

    ImageDto() {
        this.id = UUID.randomUUID().toString();
    }

    private ImageDto(String id, String path) {
        this();
        this.id = id;
        this.path = path;
    }

    public static ImageDto of(String id, String path) {
        return new ImageDto(id, path);
    }

}
