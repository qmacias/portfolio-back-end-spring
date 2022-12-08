package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.exception.ConflictException;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonMapper;
import org.example.portfolio.infrastructure.repository.PersonRepository;

import java.util.List;

public class PersonJpaAdapter implements PersonPersistencePort {

    private final PersonRepository personRepository;

    public PersonJpaAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDto> getAll() {
        List<PersonEntity> personEntityList = personRepository.findAll();
        return PersonMapper.INSTANCE.mapEntityListToDtoList(personEntityList);
    }

    @Override
    public PersonDto getById(String id) {
        PersonEntity personEntity = personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Person id: " + id));
        return PersonMapper.INSTANCE.mapEntityToDto(personEntity);
    }

    @Override
    public PersonDto createOrUpdate(PersonDto personDto) {
        PersonEntity personEntity = PersonMapper.INSTANCE.mapDtoToEntity(personDto);
        if (personEntity.getId() == null) {
            personRepository.findByEmail(personEntity.getEmail())
                    .ifPresent(person -> {
                        throw new ConflictException("Person email exist: " + person.getEmail());
                    });
        }
        return PersonMapper.INSTANCE.mapEntityToDto(personRepository.save(personEntity));
    }

    @Override
    public void removeById(String id) {
        personRepository.deleteById(id);
    }

}
