package org.example.portfolio.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PersonEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String name;

    private Integer age;

    private String degree;

    @Column(unique = true)
    @EqualsAndHashCode.Include
    private String email;

    private String summary;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "image_id",
            referencedColumnName = "id"
    )
    private ImageEntity imageEntity;

    public PersonEntity() {
    }

    public PersonEntity(
            String name,
            Integer age,
            String degree,
            String email,
            String summary
    ) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
    }

}
