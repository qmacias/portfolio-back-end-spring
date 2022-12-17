package org.example.portfolio.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "link"})
public class SocialDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("link")
    private String link;

    SocialDto() {
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
