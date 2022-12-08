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
@Table(name = "images")
public class ImageEntity {

    @Id
    private String id;

    private String path;

    protected ImageEntity() {
    }

    private ImageEntity(String id, String path) {
        this();
        this.id = id;
        this.path = path;
    }

    public static ImageEntity of(String id, String path) {
        return new ImageEntity(id, path);
    }

}
