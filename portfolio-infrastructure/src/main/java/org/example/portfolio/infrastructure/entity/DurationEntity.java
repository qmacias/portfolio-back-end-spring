package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "duration")
public class DurationEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "start_date", nullable = false)
    private String startDate;

    @Column(name = "finish_date", nullable = false)
    private String finishDate;

    protected DurationEntity() {
        super();
    }

    private DurationEntity(String id, String startDate, String finishDate) {
        this();
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public static DurationEntity of(String id, String startDate, String finishDate) {
        return new DurationEntity(id, startDate, finishDate);
    }

    public String getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

}
