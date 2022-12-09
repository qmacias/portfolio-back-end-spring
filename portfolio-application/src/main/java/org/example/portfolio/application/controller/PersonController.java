package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.input.PersonServicePort;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/person")
public class PersonController {

    private final PersonServicePort personService;

    @Autowired
    public PersonController(PersonServicePort personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDto> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public PersonDto getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public PersonDto createOrUpdatePerson(@RequestBody PersonDto personDto) {
        return personService.createOrUpdatePerson(personDto);
    }

    @DeleteMapping("/{id}")
    public void removePersonById(@PathVariable String id) {
        personService.removePersonById(id);
    }

}
