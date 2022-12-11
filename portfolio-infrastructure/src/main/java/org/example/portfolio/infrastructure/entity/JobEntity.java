package org.example.portfolio.infrastructure.entity;

import lombok.Getter;

import javax.persistence.*;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.io.Serializable;
import java.util.List;

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

    @Column(name = "start_date")
    protected String startDate;

    @Column(name = "finish_date")
    protected String finishDate;

    @JoinColumn(name = "job_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<AchievementEntity> achievementEntities;

    protected JobEntity() {
        super();
    }

    protected JobEntity(
            String id,
            String position,
            String description,
            String startDate,
            String finishDate,
            List<AchievementEntity> achievementEntities
    ) {
        this();
        this.id = id;
        this.position = position;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.achievementEntities = achievementEntities;
    }

    public Period getPeriod() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM, yyyy");
        return Period.between(
                LocalDate.parse(this.startDate, formatter),
                LocalDate.parse(this.finishDate, formatter)
        );
    }

}
