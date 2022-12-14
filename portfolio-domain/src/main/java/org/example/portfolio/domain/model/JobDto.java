package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "position", "description",
        "duration", "achievements"})
public class JobDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("description")
    private String description;

    @JsonProperty("duration")
    private DurationDto duration;

    @JsonProperty("achievements")
    private Set<AchievementDto> achievementDtoSet;

    private JobDto() {
        this.id = "";
        this.position = "";
        this.description = "";
        this.duration = null;
        this.achievementDtoSet = null;
    }

    JobDto(
            String id,
            String position,
            String description,
            DurationDto duration,
            Set<AchievementDto> achievementDtoSet
    ) {
        this.id = id;
        this.position = position;
        this.description = description;
        this.duration = duration;
        this.achievementDtoSet = achievementDtoSet;
    }

    public String getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public DurationDto getDuration() {
        return duration;
    }

    public Set<AchievementDto> getAchievementDtoSet() {
        return achievementDtoSet;
    }

}
