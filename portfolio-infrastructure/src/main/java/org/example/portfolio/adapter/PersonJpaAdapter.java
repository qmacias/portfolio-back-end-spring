package org.example.portfolio.adapter;

import org.example.portfolio.data.PersonDto;
import org.example.portfolio.port.out.PersonPersistencePort;

import org.example.portfolio.repository.PersonRepository;

import java.util.List;

public class PersonJpaAdapter implements PersonPersistencePort {

    private PersonRepository personRepository;

    public PersonJpaAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDto> findAll() {
        return null;
    }

    @Override
    public PersonDto findById(Long id) {
        return null;
    }

    @Override
    public PersonDto save(PersonDto person) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }

}
