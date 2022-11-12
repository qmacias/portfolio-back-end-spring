package org.example.portfolio.infrastructure.entity;

import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Data
@NoArgsConstructor
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

    public ImageEntity(Long id, String path) {
        this.id = id;
        this.path = path;
    }

}
