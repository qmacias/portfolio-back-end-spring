package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "social")
public class SocialEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "link")
    private String link;

    protected SocialEntity() {
        super();
    }

    private SocialEntity(String id, String link) {
        this();
        this.id = id;
        this.link = link;
    }

    public static SocialEntity of(String id, String link) {
        return new SocialEntity(id, link);
    }

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

}
