package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "description"})
public class AchievementDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("description")
    private String description;

    private AchievementDto() {
        this.id = "";
        this.description = "";
    }

    private AchievementDto(String id, String description) {
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
