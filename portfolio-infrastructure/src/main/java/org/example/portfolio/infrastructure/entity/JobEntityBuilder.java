package org.example.portfolio.infrastructure.entity;

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

    public JobEntityBuilder setDuration(DurationEntity durationEntity) {
        this.durationEntity = durationEntity;
        return this;
    }

    public JobEntityBuilder setAchievementEntities(List<AchievementEntity> achievementEntities) {
        this.achievementEntities = achievementEntities;
        return this;
    }

    public JobEntity createJobEntity() {
        return new JobEntity(id, position, description, durationEntity, achievementEntities);
    }

}