package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.domain.port.in.ImageServicePort;
import org.example.portfolio.domain.port.in.PersonServicePort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
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
        return personService.getAll();
    }

    @GetMapping("/{id}")
    public PersonDto getPerson(@PathVariable Long id) {
        return personService.getById(id);
    }

    @PostMapping
    public PersonDto addPerson(@RequestBody PersonDto personDto) {
        return personService.create(personDto);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.removeById(id);
    }

    @PutMapping("/{id}/images/{imageId}")
    public PersonDto assignDetail(@PathVariable Long id, @PathVariable Long imageId) {

        ImageDto imageDto = imageService.getById(imageId);

        return personService.assignDetails(imageDto, id);
    }

}
