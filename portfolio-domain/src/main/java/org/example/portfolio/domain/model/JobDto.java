package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobDto {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    protected String id;

    @lombok.Getter(onMethod_ = {@JsonProperty("position")})
    protected String position;

    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    protected String description;

    @lombok.Getter(onMethod_ = {@JsonProperty("start_date")})
    protected String startDate;

    @lombok.Getter(onMethod_ = {@JsonProperty("finish_date")})
    protected String finishDate;

    @lombok.Getter(onMethod_ = {@JsonProperty("achievements")})
    protected List<AchievementDto> achievementDtoList;

    JobDto() {
        this.id = UUID.randomUUID().toString();
    }

    protected JobDto(
            String id,
            String position,
            String description,
            String startDate,
            String finishDate,
            List<AchievementDto> achievementDtoList
    ) {
        this();
        this.id = id;
        this.position = position;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.achievementDtoList = achievementDtoList;
    }

}