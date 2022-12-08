package org.example.portfolio.domain.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocialDto {

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

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

}
