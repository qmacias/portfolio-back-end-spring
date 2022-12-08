package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import lombok.Getter;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.io.Serializable;

@Getter
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {

    @Id
    @Column
    protected String id;

    @Column
    protected String name;

    @Column
    protected Integer age;

    @Column
    protected String degree;

    @Column(unique = true)
    protected String email;

    @Column
    protected String summary;

    @JoinColumn(name = "image_id")
    @OneToOne(cascade = CascadeType.ALL)
    protected ImageEntity imageEntity;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<PhoneEntity> phoneEntities = new ArrayList<>();

    @JoinColumn(name = "person_id")
    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<AddressEntity> addressEntities = new ArrayList<>();

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<SocialEntity> socialEntities = new ArrayList<>();

    protected PersonEntity() {
    }

    protected PersonEntity(
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

    public void addAddressEntity(AddressEntity addressEntity) {
        addressEntities.add(addressEntity);
    }

    public void addSocialEntity(SocialEntity socialEntity) {
        socialEntities.add(socialEntity);
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
