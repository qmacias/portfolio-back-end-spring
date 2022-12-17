package org.example.portfolio.infrastructure.entity;

import java.util.Set;

import java.io.Serializable;

public class JobEntityBuilder implements Serializable {

    private String id;

    private String position;

    private String description;

    private DurationEntity durationEntity;

    private Set<AchievementEntity> achievementEntities;

    protected JobEntityBuilder() {
        super();
    }

    public static JobEntityBuilder builder() {
        return new JobEntityBuilder();
    }

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

    public JobEntityBuilder setAchievementEntities(Set<AchievementEntity> achievementEntities) {
        this.achievementEntities = achievementEntities;
        return this;
    }

    public JobEntity build() {
        return new JobEntity(id, position, description, durationEntity, achievementEntities);
    }

}