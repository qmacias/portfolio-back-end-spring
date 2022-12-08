package org.example.portfolio.infrastructure.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
@Table(name = "phones")
public class PhoneEntity implements Serializable {

    @Id
    @Column
    private String id;

    @Column
    private String type;

    @Column
    private String number;

    protected PhoneEntity() {
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
