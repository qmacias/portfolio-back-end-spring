package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "jobs")
public class AchievementEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "description")
    private String description;

    protected AchievementEntity() {
        super();
    }

    private AchievementEntity(String id, String description) {
        this();
        this.id = id;
        this.description = description;
    }

    public static AchievementEntity of(String id, String description) {
        return new AchievementEntity(id, description);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
