package org.example.portfolio.controller;

import org.example.portfolio.data.ImageDto;
import org.example.portfolio.data.PersonDto;

import org.example.portfolio.port.in.ImageServicePort;
import org.example.portfolio.port.in.PersonServicePort;

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
    public PersonDto addPerson(@RequestBody PersonDto person) {
        return personService.addPerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

    @PutMapping("/{id}/images/{imageId}")
    public PersonDto assignDetail(@PathVariable Long id, @PathVariable Long imageId) {
        ImageDto image = imageService.getImage(imageId);
        return personService.assignImage(id, image);
    }

}
