package org.example.portfolio.domain.port.input;

import org.example.portfolio.domain.model.PersonDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface PersonServicePort {

    List<PersonDto> getAllPerson();

    PersonDto getPersonById(String id);

    PersonDto createOrUpdatePerson(PersonDto personDto);

    void removePersonById(String id);

}
