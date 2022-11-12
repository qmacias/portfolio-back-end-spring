package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.data.PersonDto;
import org.example.portfolio.domain.port.out.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonMapper;
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
            return PersonMapper.PERSON_INSTANCE.mapEntityToDto(personEntity.get());
        }

        return null;
    }

    @Override
    public PersonDto save(PersonDto personDto) {

        PersonEntity personEntity = PersonMapper.PERSON_INSTANCE.mapDtoToEntity(personDto);

        PersonEntity personEntitySaved = personRepository.save(personEntity);

        return PersonMapper.PERSON_INSTANCE.mapEntityToDto(personEntitySaved);
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

}
