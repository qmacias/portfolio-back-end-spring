package org.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Entity
@Table(name = "images")
@Getter
@Setter
public class ImageEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String path;

    public ImageEntity() {
    }

    public ImageEntity(String path) {
        this.path = path;
    }

}
