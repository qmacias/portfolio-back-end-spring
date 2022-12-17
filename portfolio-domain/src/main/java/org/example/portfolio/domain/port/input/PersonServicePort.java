package org.example.portfolio.domain.port.input;

import org.example.portfolio.domain.model.PersonDto;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.SERIALIZABLE
)
public interface PersonServicePort {

    Set<PersonDto> getAllPerson();

    PersonDto getPersonById(String id);

    PersonDto createOrEditPerson(PersonDto personDto);

    void removePersonById(String id);

}
