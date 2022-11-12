package org.example.portfolio.application.controller;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.domain.port.in.ImageServicePort;
import org.example.portfolio.domain.port.in.PersonServicePort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonServicePort personService;

    private final ImageServicePort imageService;

    @Autowired
    public PersonController(
            PersonServicePort personService,
            ImageServicePort imageService
    ) {
        this.personService = personService;
        this.imageService = imageService;
    }

    @GetMapping
    public List<PersonDto> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public PersonDto getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @PostMapping
    public PersonDto addPerson(@RequestBody PersonDto personDto) {
        return personService.addPerson(personDto);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

    @PutMapping("/{id}/images/{imageId}")
    public PersonDto assignDetail(@PathVariable Long id, @PathVariable Long imageId) {
        ImageDto imageDto = imageService.getImage(imageId);
        return personService.assignImage(id, imageDto);
    }

}
