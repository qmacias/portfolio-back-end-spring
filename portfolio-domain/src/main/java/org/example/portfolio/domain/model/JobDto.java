package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "position", "description", "duration", "achievements"})
public class JobDto {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    protected String id;

    @lombok.Getter(onMethod_ = {@JsonProperty("position")})
    protected String position;

    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    protected String description;

    @lombok.Getter(onMethod_ = {@JsonProperty("duration")})
    protected DurationDto duration;

    @lombok.Getter(onMethod_ = {@JsonProperty("achievements")})
    protected Set<AchievementDto> achievementDtoSet;

    JobDto() {
    }

    protected JobDto(
            String id,
            String position,
            String description,
            DurationDto duration,
            Set<AchievementDto> achievementDtoSet
    ) {
        this();
        this.id = id;
        this.position = position;
        this.description = description;
        this.duration = duration;
        this.achievementDtoSet = achievementDtoSet;
    }

}
