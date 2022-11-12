package org.example.portfolio.domain.port.in;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.data.PersonDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonServicePort {

    List<PersonDto> getAllPerson();

    PersonDto getPerson(Long id);

    PersonDto addPerson(PersonDto personDto);

    void deletePerson(Long id);

    PersonDto assignImage(Long personId, ImageDto imageDto);

}
