package org.example.portfolio.domain.service;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.port.input.PersonServicePort;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import java.util.List;

public class PersonServiceImpl implements PersonServicePort {

    private final PersonPersistencePort personPersistencePort;

    public PersonServiceImpl(PersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public List<PersonDto> getAll() {
        return personPersistencePort.getAll();
    }

    @Override
    public PersonDto getById(Long id) {
        return personPersistencePort.getById(id);
    }

    @Override
    public PersonDto createOrUpdate(PersonDto personDto) {
        return personPersistencePort.createOrUpdate(personDto);
    }

    @Override
    public void removeById(Long id) {
        personPersistencePort.removeById(id);
    }

}
