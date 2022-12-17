package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.util.Objects;

import java.util.Set;

import java.io.Serializable;

@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthdate", nullable = false)
    private String birthdate;

    @Column(name = "degree")
    private String degree;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "summary")
    private String summary;

    @JoinColumn(name = "image_id")
    @OneToOne(cascade = CascadeType.ALL)
    private ImageEntity imageEntity;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PhoneEntity> phoneEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AddressEntity> addressEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SocialEntity> socialEntities;

    @JoinColumn(name = "person_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JobEntity> jobEntities;

    protected PersonEntity() {
        super();
    }

    PersonEntity(
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

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDegree() {
        return degree;
    }

    public String getEmail() {
        return email;
    }

    public String getSummary() {
        return summary;
    }

    public ImageEntity getImageEntity() {
        return imageEntity;
    }

    public Set<PhoneEntity> getPhoneEntities() {
        return phoneEntities;
    }

    public Set<AddressEntity> getAddressEntities() {
        return addressEntities;
    }

    public Set<SocialEntity> getSocialEntities() {
        return socialEntities;
    }

    public Set<JobEntity> getJobEntities() {
        return jobEntities;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PersonEntity) {
            PersonEntity other = (PersonEntity) obj;
            return Objects.equals(this.email, other.email);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

}
