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

    @lombok.Getter(onMethod_ = {@JsonProperty("start_date")})
    protected String startDate;

    @lombok.Getter(onMethod_ = {@JsonProperty("finish_date")})
    protected String finishDate;

    @lombok.Getter(onMethod_ = {@JsonProperty("period")})
    protected String period;

    @lombok.Getter(onMethod_ = {@JsonProperty("achievements")})
    protected List<AchievementDto> achievementDtoList;

    JobDto() {
    }

    protected JobDto(
            String id,
            String position,
            String description,
            String startDate,
            String finishDate,
            String period,
            List<AchievementDto> achievementDtoList
    ) {
        this();
        this.id = id;
        this.position = position;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.period = period;
        this.achievementDtoList = achievementDtoList;
    }

}
