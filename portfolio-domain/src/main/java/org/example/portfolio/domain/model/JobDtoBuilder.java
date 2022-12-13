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

    public JobDtoBuilder setDuration(DurationDto duration) {
        this.duration = duration;
        return this;
    }

    public JobDtoBuilder setAchievementDtoList(List<AchievementDto> achievementDtoList) {
        this.achievementDtoList = achievementDtoList;
        return this;
    }

    public JobDto createJobDto() {
        return new JobDto(id, position, description, duration, achievementDtoList);
    }

}