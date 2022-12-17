package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "path"})
public class ImageDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("path")
    private String path;

    ImageDto() {
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
