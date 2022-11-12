package org.example.portfolio.service;

import org.example.portfolio.data.ImageDto;
import org.example.portfolio.data.PersonDto;
import org.example.portfolio.port.in.PersonServicePort;
import org.example.portfolio.port.out.PersonPersistencePort;

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
    public PersonDto addPerson(PersonDto person) {
        return personPersistencePort.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        personPersistencePort.deleteById(id);
    }

    @Override
    public PersonDto assignImage(Long personId, ImageDto image) {
        PersonDto person = personPersistencePort.findById(personId);
        person.setImage(image.toString());
        return personPersistencePort.save(person);
    }

}
