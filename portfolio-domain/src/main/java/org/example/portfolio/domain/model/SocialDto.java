package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@JsonInclude(
        JsonInclude.Include.NON_NULL
)
public class SocialDto implements Serializable {

    private String id;

    private String link;

    SocialDto() {
        this.id = UUID.randomUUID().toString();
    }

    private SocialDto(String id, String link) {
        this();
        this.id = id;
        this.link = link;
    }

    public static SocialDto of(String id, String link) {
        return new SocialDto(id, link);
    }

}
