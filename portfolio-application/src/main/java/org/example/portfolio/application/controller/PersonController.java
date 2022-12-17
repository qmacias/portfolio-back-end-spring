package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.input.PersonServicePort;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

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
    public Set<PersonDto> getAll() {
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public PersonDto getById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public PersonDto createOrEdit(@RequestBody PersonDto personDto) {
        return personService.createOrEditPerson(personDto);
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable String id) {
        personService.removePersonById(id);
    }

}
