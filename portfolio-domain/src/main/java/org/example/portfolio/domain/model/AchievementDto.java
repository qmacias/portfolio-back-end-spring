package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AchievementDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("description")
    private String description;

    AchievementDto() {
        this.id = UUID.randomUUID().toString();
    }

    private AchievementDto(String id, String description) {
        this();
        this.id = id;
        this.description = description;
    }

    public static AchievementDto of(String id, String description) {
        return new AchievementDto(id, description);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
