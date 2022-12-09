package org.example.portfolio.infrastructure.entity;

import lombok.Getter;

import javax.persistence.*;

import java.util.List;
import java.util.Objects;

import java.io.Serializable;

@Getter
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {

    @Id
    @Column(name = "id")
    protected String id;

    @Column(name = "name")
    protected String name;

    @Column(name = "age")
    protected Integer age;

    @Column(name = "degree")
    protected String degree;

    @Column(name = "email", unique = true)
    protected String email;

    @Column(name = "summary")
    protected String summary;

    @JoinColumn(name = "image_id")
    @OneToOne(cascade = CascadeType.ALL)
    protected ImageEntity imageEntity;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<PhoneEntity> phoneEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<AddressEntity> addressEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected List<SocialEntity> socialEntities;

    protected PersonEntity() {
        super();
    }

    protected PersonEntity(
            String id,
            String name,
            Integer age,
            String degree,
            String email,
            String summary,
            ImageEntity imageEntity,
            List<PhoneEntity> phoneEntities,
            List<AddressEntity> addressEntities,
            List<SocialEntity> socialEntities
    ) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageEntity = imageEntity;
        this.phoneEntities = phoneEntities;
        this.addressEntities = addressEntities;
        this.socialEntities = socialEntities;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PersonEntity) {
            PersonEntity other = (PersonEntity) obj;
            return Objects.equals(this.email, other.email);
        }
        return false;
    }

}
