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
@Table(name = "phones")
public class PhoneEntity {

    @Id
    private String id;

    private String type;

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

}
