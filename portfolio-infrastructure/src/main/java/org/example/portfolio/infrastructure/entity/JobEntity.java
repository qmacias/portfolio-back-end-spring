package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.util.Set;

import java.io.Serializable;

@Entity
@Table(name = "jobs")
public class JobEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "position")
    private String position;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "duration_id")
    @OneToOne(cascade = CascadeType.ALL)
    private DurationEntity durationEntity;

    @JoinColumn(name = "job_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AchievementEntity> achievementEntities;

    protected JobEntity() {
        super();
    }

    JobEntity(
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

    public String getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public DurationEntity getDurationEntity() {
        return durationEntity;
    }

    public Set<AchievementEntity> getAchievementEntities() {
        return achievementEntities;
    }

}
