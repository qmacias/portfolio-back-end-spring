package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.data.PersonDto;
import org.example.portfolio.domain.port.out.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.Mapper;
import org.example.portfolio.infrastructure.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

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

        Optional<PersonEntity> personEntity = personRepository.findById(id);

        if (personEntity.isPresent()) {
            return Mapper.INSTANCE.map(personEntity, PersonDto.class);
        }

        return null;
    }

    @Override
    public PersonDto save(PersonDto personDto) {

        PersonEntity personEntity = Mapper.INSTANCE.map(personDto, PersonEntity.class);

        PersonEntity personEntitySaved = personRepository.save(personEntity);

        return Mapper.INSTANCE.map(personEntitySaved, PersonDto.class);
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

}
