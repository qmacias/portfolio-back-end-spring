package org.example.portfolio.infrastructure.entity;

import lombok.Getter;

import javax.persistence.*;

import java.util.Objects;

import java.io.Serializable;
import java.util.Set;

@Getter
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    protected String id;

    @Column(name = "name")
    protected String name;

    @Column(name = "birthdate", nullable = false)
    protected String birthdate;

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
    protected Set<PhoneEntity> phoneEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected Set<AddressEntity> addressEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected Set<SocialEntity> socialEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    protected Set<JobEntity> jobEntities;

    protected PersonEntity() {
        super();
    }

    protected PersonEntity(
            String id,
            String name,
            String birthdate,
            String degree,
            String email,
            String summary,
            ImageEntity imageEntity,
            Set<PhoneEntity> phoneEntities,
            Set<AddressEntity> addressEntities,
            Set<SocialEntity> socialEntities,
            Set<JobEntity> jobEntities
    ) {
        this();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.degree = degree;
        this.email = email;
        this.summary = summary;
        this.imageEntity = imageEntity;
        this.phoneEntities = phoneEntities;
        this.addressEntities = addressEntities;
        this.socialEntities = socialEntities;
        this.jobEntities = jobEntities;
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
