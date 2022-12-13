package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DurationDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("finish_date")
    private String finishDate;

    DurationDto() {
    }

    private DurationDto(String id, String startDate, String finishDate) {
        this();
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public static DurationDto of(String id, String startDate, String finishDate) {
        return new DurationDto(id, startDate, finishDate);
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
