package org.example.portfolio.domain.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageDto {

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

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

}
