package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@Entity
@Table(name = "person")
public class PersonEntity {

    @Id
    private String id;

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

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(
            name = "person_id"
    )
    private List<PhoneEntity> phoneEntities;

    protected PersonEntity() {
        super();
        this.imageEntity = new ImageEntity();
        this.phoneEntities = new ArrayList<>();
    }

    public PersonEntity(
            String id,
            String name,
            Integer age,
            String degree,
            String email,
            String summary,
            ImageEntity imageEntity
    ) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageEntity = imageEntity;
    }

    public void addPhoneEntity(PhoneEntity phoneEntity) {
        phoneEntities.add(phoneEntity);
    }

    public void removePhoneEntity(PhoneEntity phoneEntity) {
        if (phoneEntities != null) {
            phoneEntities.remove(phoneEntity);
        }
    }

}
