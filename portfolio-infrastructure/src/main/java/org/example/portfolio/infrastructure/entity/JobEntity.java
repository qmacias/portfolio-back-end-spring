package org.example.portfolio.infrastructure.entity;

import lombok.Getter;

import javax.persistence.*;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

import java.util.List;

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

    protected Period calculatePeriod() {
        return Period.between(this.toLocalDate(this.startDate), this.toLocalDate(this.finishDate));
    }

    protected String formatInputString(String date) {
        //return DateTimeFormatter.ofLocalizedDate(null).format(this.toLocalDate(date));
        return this.getCustomDateTimeFormatter().format(this.toLocalDate(date));
    }

    private LocalDate toLocalDate(String date) {
//        LocalDate source = LocalDate.parse(date, this.getSpanishDateTimeFormatter());
//        return LocalDate.parse(date, this.getCustomDateTimeFormatter());
        return LocalDate.parse(date, this.getLocalDateTimeFormatter());
    }

    private DateTimeFormatter getLocalDateTimeFormatter() {
        // modify pattern according to input string format type
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    private DateTimeFormatter getCustomDateTimeFormatter() {
        // modify pattern according to input string format type
        return DateTimeFormatter.ofPattern("MMM yyyy");
    }

}
