package org.example.portfolio.infrastructure.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String name;

    private Integer age;

    private String degree;

    @EqualsAndHashCode.Include
    @Column(unique = true)
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

    public PersonEntity(
            Long id,
            String name,
            Integer age,
            String degree,
            String email,
            String summary,
            ImageEntity imageEntity
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageEntity = imageEntity;
    }

}
