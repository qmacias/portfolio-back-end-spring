package org.example.portfolio.infrastructure.entity;

import org.example.portfolio.domain.util.CustomDateFormatter;

import java.util.List;

public class JobEntityBuilder extends JobEntity {

    private List<AchievementEntity> achievementEntities;

    public JobEntityBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public JobEntityBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public JobEntityBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public JobEntityBuilder setStartDate(String startDate) {
        this.startDate = CustomDateFormatter.formatInputString(startDate);
        return this;
    }

    public JobEntityBuilder setFinishDate(String finishDate) {
        this.finishDate = CustomDateFormatter.formatInputString(finishDate);
        return this;
    }

    public JobEntityBuilder setAchievementEntities(List<AchievementEntity> achievementEntities) {
        this.achievementEntities = achievementEntities;
        return this;
    }

    public JobEntity createJobEntity() {
        return new JobEntity(id, position, description, startDate, finishDate, achievementEntities);
    }

}