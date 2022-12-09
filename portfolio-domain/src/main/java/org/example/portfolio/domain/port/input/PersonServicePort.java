package org.example.portfolio.domain.port.input;

import org.example.portfolio.domain.model.PersonDto;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.SERIALIZABLE
)
public interface PersonServicePort {

    List<PersonDto> getAllPerson();

    PersonDto getPersonById(String id);

    PersonDto createOrUpdatePerson(PersonDto personDto);

    void removePersonById(String id);

}
