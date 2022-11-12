package org.example.portfolio.port.in;

import org.example.portfolio.data.ImageDto;
import org.example.portfolio.data.PersonDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonServicePort {

    List<PersonDto> getAllPerson();

    PersonDto getPerson(Long id);

    PersonDto addPerson(PersonDto person);

    void deletePerson(Long id);

    PersonDto assignImage(Long personId, ImageDto image);

}
