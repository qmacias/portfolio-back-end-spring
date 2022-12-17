package org.example.portfolio.domain.service;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.input.PersonServicePort;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import java.util.Set;

public class PersonServiceImpl implements PersonServicePort {

    private final PersonPersistencePort personPersistencePort;

    public PersonServiceImpl(PersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public Set<PersonDto> getAllPerson() {
        return personPersistencePort.findAllPerson();
    }

    @Override
    public PersonDto getPersonById(String id) {
        return personPersistencePort.findPersonById(id);
    }

    @Override
    public PersonDto createOrEditPerson(PersonDto personDto) {
        return personPersistencePort.insertOrUpdatePerson(personDto);
    }

    @Override
    public void removePersonById(String id) {
        personPersistencePort.deletePersonById(id);
    }

}
