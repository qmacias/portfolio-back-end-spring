package org.example.portfolio.infrastructure.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {

    @Id
    @Column
    private String id;

    @Column
    private String type;

    @Column
    private String description;

    protected AddressEntity() {
    }

    private AddressEntity(String id, String type, String description) {
        this();
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public static AddressEntity of(String id, String type, String description) {
        return new AddressEntity(id, type, description);
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

}
