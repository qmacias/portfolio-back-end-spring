package org.example.portfolio.infrastructure.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
@Table(name = "social")
public class SocialEntity implements Serializable {

    @Id
    @Column
    private String id;

    @Column
    private String link;

    protected SocialEntity() {
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
