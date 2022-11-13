package org.example.portfolio.domain.service;

import org.example.portfolio.domain.port.in.PersonServicePort;
import org.example.portfolio.domain.port.out.PersonPersistencePort;
import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonServicePort {

    private final PersonPersistencePort personPersistencePort;

    public PersonService(PersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public List<PersonDto> getAllPerson() {
        return personPersistencePort.findAll();
    }

    @Override
    public PersonDto getPerson(Long id) {
        return personPersistencePort.findById(id);
    }

    @Override
    public PersonDto addPerson(PersonDto personDto) {
        return personPersistencePort.save(personDto);
    }

    @Override
    public void deletePerson(Long id) {
        personPersistencePort.deleteById(id);
    }

    @Override
    public PersonDto assignImage(Long personId, ImageDto imageDto) {

        PersonDto personDto = personPersistencePort.findById(personId);

        personDto.setImage(imageDto);

        return personPersistencePort.save(personDto);
    }

}
