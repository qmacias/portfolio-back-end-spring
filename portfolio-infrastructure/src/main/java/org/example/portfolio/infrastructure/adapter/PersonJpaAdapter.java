package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.data.PersonDto;
import org.example.portfolio.domain.port.out.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonDtoToPersonEntityMapper;
import org.example.portfolio.infrastructure.mapper.PersonEntityToPersonDtoMapper;
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

        List<PersonEntity> personEntityList = personRepository.findAll();

        return PersonEntityToPersonDtoMapper
                .TO_PERSON_DTO_MAPPER.mapEntityListToDtoList(personEntityList);
    }

    @Override
    public PersonDto findById(Long id) {

        Optional<PersonEntity> personEntity = personRepository.findById(id);

        if (personEntity.isPresent()) {

            return PersonEntityToPersonDtoMapper
                    .TO_PERSON_DTO_MAPPER.mapEntityToDto(personEntity.get());
        }

        return null;
    }

    @Override
    public PersonDto save(PersonDto personDto) {

        PersonEntity personEntity = PersonDtoToPersonEntityMapper
                .TO_PERSON_ENTITY_MAPPER.mapDtoToEntity(personDto);

        PersonEntity personEntitySaved = personRepository.save(personEntity);

        return PersonEntityToPersonDtoMapper
                .TO_PERSON_DTO_MAPPER.mapEntityToDto(personEntitySaved);
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

}
