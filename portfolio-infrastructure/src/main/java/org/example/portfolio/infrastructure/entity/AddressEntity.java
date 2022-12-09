package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    protected AddressEntity() {
        super();
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
