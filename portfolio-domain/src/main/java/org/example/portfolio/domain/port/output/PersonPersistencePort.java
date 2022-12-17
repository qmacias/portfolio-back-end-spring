package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.PersonDto;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonPersistencePort {

    Set<PersonDto> findAllPerson();

    PersonDto findPersonById(String id);

    PersonDto insertOrUpdatePerson(PersonDto personDto);

    void deletePersonById(String id);

}
