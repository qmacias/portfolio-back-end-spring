package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

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
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String path;

    protected ImageEntity() {
        super();
    }

    public ImageEntity(Long id, String path) {
        this();
        this.id = id;
        this.path = path;
    }

}
