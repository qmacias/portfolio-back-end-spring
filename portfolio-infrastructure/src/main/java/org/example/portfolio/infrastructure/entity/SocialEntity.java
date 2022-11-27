package org.example.portfolio.infrastructure.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@Entity
@Table(name = "social")
public class SocialEntity {

    @Id
    private String id;

    private String link;

    protected SocialEntity() {
        super();
    }

    public SocialEntity(String id, String link) {
        this();
        this.id = id;
        this.link = link;
    }

}
