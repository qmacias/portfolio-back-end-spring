package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.out.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.example.portfolio.infrastructure.mapper.ToPersonEntityMapper;
import org.example.portfolio.infrastructure.mapper.ToPersonDtoMapper;

import org.example.portfolio.infrastructure.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

public class PersonJpaAdapter implements PersonPersistencePort {

    private PersonRepository personRepository;

    public PersonJpaAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDto> getAll() {

        List<PersonEntity> personEntityList = personRepository.findAll();

        return ToPersonDtoMapper
                .TO_PERSON_DTO_MAPPER.mapEntityListToDtoList(personEntityList);
    }

    @Override
    public PersonDto getById(Long id) {

        Optional<PersonEntity> personEntity = personRepository.findById(id);

        if (personEntity.isPresent()) {

            return ToPersonDtoMapper
                    .TO_PERSON_DTO_MAPPER.mapEntityToDto(personEntity.get());
        }

        return null;
    }

    @Override
    public PersonDto create(PersonDto personDto) {

        PersonEntity personEntity = ToPersonEntityMapper
                .TO_PERSON_ENTITY_MAPPER.mapDtoToEntity(personDto);

        PersonEntity personEntitySaved = personRepository.save(personEntity);

        return ToPersonDtoMapper
                .TO_PERSON_DTO_MAPPER.mapEntityToDto(personEntitySaved);
    }

    @Override
    public void removeById(Long id) {
        personRepository.deleteById(id);
    }

}
