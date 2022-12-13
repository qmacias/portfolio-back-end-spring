package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
    protected List<AchievementDto> achievementDtoList;

    JobDto() {
    }

    protected JobDto(
            String id,
            String position,
            String description,
            DurationDto duration,
            List<AchievementDto> achievementDtoList
    ) {
        this();
        this.id = id;
        this.position = position;
        this.description = description;
        this.duration = duration;
        this.achievementDtoList = achievementDtoList;
    }

}
