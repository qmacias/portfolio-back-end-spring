package org.example.portfolio.domain.service;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.input.PersonServicePort;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import java.util.List;

public class PersonServiceImpl implements PersonServicePort {

    private final PersonPersistencePort personPersistencePort;

    public PersonServiceImpl(PersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public List<PersonDto> getAllPerson() {
        return personPersistencePort.getAll();
    }

    @Override
    public PersonDto getPersonById(String id) {
        return personPersistencePort.getById(id);
    }

    @Override
    public PersonDto createOrUpdatePerson(PersonDto personDto) {
        return personPersistencePort.createOrUpdate(personDto);
    }

    @Override
    public void removePersonById(String id) {
        personPersistencePort.removeById(id);
    }

}
