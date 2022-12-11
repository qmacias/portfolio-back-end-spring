package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "phones")
public class PhoneEntity implements Serializable {

    @Id
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "number")
    private String number;

    protected PhoneEntity() {
        super();
    }

    private PhoneEntity(String id, String type, String number) {
        this();
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public static PhoneEntity of(String id, String type, String number) {
        return new PhoneEntity(id, type, number);
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

}
