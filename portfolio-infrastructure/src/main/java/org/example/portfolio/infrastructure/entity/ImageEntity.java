package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "images")
public class ImageEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "path")
    private String path;

    protected ImageEntity() {
        super();
    }

    private ImageEntity(String id, String path) {
        this();
        this.id = id;
        this.path = path;
    }

    public static ImageEntity of(String id, String path) {
        return new ImageEntity(id, path);
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

}
