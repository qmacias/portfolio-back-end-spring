package org.example.portfolio.domain.model;

import java.util.Set;

public class JobDtoBuilder {

    private String id;

    private String position;

    private String description;

    private DurationDto duration;

    private Set<AchievementDto> achievementDtoSet;

    private JobDtoBuilder() {
        this.id = "";
        this.position = "";
        this.description = "";
        this.duration = null;
        this.achievementDtoSet = null;
    }

    public static JobDtoBuilder builder() {
        return new JobDtoBuilder();
    }

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

    public JobDtoBuilder setAchievementDtoSet(Set<AchievementDto> achievementDtoSet) {
        this.achievementDtoSet = achievementDtoSet;
        return this;
    }

    public JobDto build() {
        return new JobDto(id, position, description, duration, achievementDtoSet);
    }

}