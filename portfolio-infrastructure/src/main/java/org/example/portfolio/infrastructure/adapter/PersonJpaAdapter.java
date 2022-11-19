package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.ConflictException;
import org.example.portfolio.domain.exception.NotFoundException;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.example.portfolio.infrastructure.mapper.ToPersonEntityMapper;
import org.example.portfolio.infrastructure.mapper.ToPersonDtoMapper;

import org.example.portfolio.infrastructure.repository.PersonRepository;

import java.util.List;

public class PersonJpaAdapter implements PersonPersistencePort {

    private PersonRepository personRepository;

    private ToPersonDtoMapper toPersonDtoMapper;

    private ToPersonEntityMapper toPersonEntityMapper;

    public PersonJpaAdapter(
            PersonRepository personRepository,
            ToPersonDtoMapper toPersonDtoMapper,
            ToPersonEntityMapper toPersonEntityMapper
    ) {
        this.personRepository = personRepository;
        this.toPersonDtoMapper = toPersonDtoMapper;
        this.toPersonEntityMapper = toPersonEntityMapper;
    }

    @Override
    public List<PersonDto> getAll() {

        List<PersonEntity> personEntityList = personRepository.findAll();

        return toPersonDtoMapper.mapEntityListToDtoList(personEntityList);
    }

    @Override
    public PersonDto getById(Long id) {

        PersonEntity personEntity = personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Person id: " + id));

        return toPersonDtoMapper.mapEntityToDto(personEntity);
    }

    @Override
    public PersonDto createOrUpdate(PersonDto personDto) {

        PersonEntity personEntity = toPersonEntityMapper.mapDtoToEntity(personDto);

        if (personEntity.getId() == null) {

            personRepository.findByEmail(personEntity.getEmail())
                    .ifPresent(person -> {
                        throw new ConflictException("Person email exist: " + person.getEmail());
                    });
        }

        PersonEntity personEntitySaved = personRepository.save(personEntity);

        return toPersonDtoMapper.mapEntityToDto(personEntitySaved);
    }

    @Override
    public void removeById(Long id) {
        personRepository.deleteById(id);
    }

}
