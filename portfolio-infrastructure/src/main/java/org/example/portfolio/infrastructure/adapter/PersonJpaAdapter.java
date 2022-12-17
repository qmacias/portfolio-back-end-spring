package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.exception.ConflictException;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.PersonMapper;
import org.example.portfolio.infrastructure.repository.PersonRepository;

import java.util.Set;

public class PersonJpaAdapter implements PersonPersistencePort {

    private final PersonRepository personRepository;

    public PersonJpaAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Set<PersonDto> findAllPerson() {
        Set<PersonEntity> personEntities = personRepository.findAllSet();
        return PersonMapper.INSTANCE.mapEntitySetToDtoSet(personEntities);
    }

    @Override
    public PersonDto findPersonById(String id) {
        PersonEntity personEntity = personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Person id: " + id));
        return PersonMapper.INSTANCE.mapEntityToDto(personEntity);
    }

    @Override
    public PersonDto insertOrUpdatePerson(PersonDto personDto) {
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
    public void deletePersonById(String id) {
        personRepository.deleteById(id);
    }

}
