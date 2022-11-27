package org.example.portfolio.infrastructure.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    private String id;

    private String type;

    private String description;

    protected AddressEntity() {
        super();
    }

    public AddressEntity(String id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

}
