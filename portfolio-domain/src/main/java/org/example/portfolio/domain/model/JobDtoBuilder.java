package org.example.portfolio.domain.model;

import java.util.List;

public class JobDtoBuilder extends JobDto {

    public JobDtoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public JobDtoBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public JobDtoBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public JobDtoBuilder setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public JobDtoBuilder setFinishDate(String finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public JobDtoBuilder setPeriod(String period) {
        this.period = period;
        return this;
    }

    public JobDtoBuilder setAchievementDtoList(List<AchievementDto> achievementDtoList) {
        this.achievementDtoList = achievementDtoList;
        return this;
    }

    public JobDto createJobDto() {
        return new JobDto(id, position, description, startDate, finishDate, period, achievementDtoList);
    }

}