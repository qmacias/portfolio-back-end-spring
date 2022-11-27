package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class SocialDto {

    private String id;

    private String link;

    protected SocialDto() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public SocialDto(String id, String link) {
        this();
        this.id = id;
        this.link = link;
    }

}
