package org.example.portfolio.infrastructure.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
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

    public PhoneEntity(Long id, String type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

}
