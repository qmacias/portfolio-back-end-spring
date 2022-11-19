package org.example.portfolio.infrastructure.entity;

import javax.persistence.*;

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
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String type;

    private String number;

    protected PhoneEntity() {
        super();
    }

    public PhoneEntity(Long id, String type, String number) {
        this();
        this.id = id;
        this.type = type;
        this.number = number;
    }

}
