package org.example.portfolio.infrastructure.entity;

import lombok.Getter;

import javax.persistence.*;

import java.util.Set;

import java.io.Serializable;

@Getter
@Entity
@Table(name = "jobs")
public class JobEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    protected String id;

    @Column(name = "position")
    protected String position;

    @Column(name = "description")
    protected String description;

    @JoinColumn(name = "duration_id")
    @OneToOne(cascade = CascadeType.ALL)
    protected DurationEntity durationEntity;

    @JoinColumn(name = "job_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected Set<AchievementEntity> achievementEntities;

    protected JobEntity() {
        super();
    }

    protected JobEntity(
            String id,
            String position,
            String description,
            DurationEntity durationEntity,
            Set<AchievementEntity> achievementEntities
    ) {
        this();
        this.id = id;
        this.position = position;
        this.description = description;
        this.durationEntity = durationEntity;
        this.achievementEntities = achievementEntities;
    }

}
