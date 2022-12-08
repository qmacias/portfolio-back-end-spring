package org.example.portfolio.infrastructure.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
@Table(name = "images")
public class ImageEntity implements Serializable {

    @Id
    @Column
    private String id;

    @Column
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

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

}
