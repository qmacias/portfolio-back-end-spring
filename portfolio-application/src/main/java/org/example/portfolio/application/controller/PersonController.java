package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.port.input.ImageServicePort;
import org.example.portfolio.domain.port.input.PersonServicePort;
import org.example.portfolio.domain.port.input.PhoneServicePort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/person")
public class PersonController {

    private final PersonServicePort personService;

    private final ImageServicePort imageService;

    private final PhoneServicePort phoneService;

    @Autowired
    public PersonController(
            PersonServicePort personService,
            ImageServicePort imageService,
            PhoneServicePort phoneService
    ) {
        this.personService = personService;
        this.imageService = imageService;
        this.phoneService = phoneService;
    }

    @GetMapping
    public List<PersonDto> getAllPerson() {
        return personService.getAll();
    }

    @GetMapping("/{id}")
    public PersonDto getPersonById(@PathVariable Long id) {
        return personService.getById(id);
    }

    @PostMapping
    public PersonDto createOrUpdatePerson(@RequestBody PersonDto personDto) {
        return personService.createOrUpdate(personDto);
    }

    @DeleteMapping("/{id}")
    public void removePersonById(@PathVariable Long id) {
        personService.removeById(id);
    }

    @PutMapping("/{id}/images/{imageId}")
    public PersonDto assignImageDetails(@PathVariable Long id, @PathVariable Long imageId) {

        ImageDto imageDto = imageService.getById(imageId);

        return personService.assignDetails(imageDto, id);
    }

    @PutMapping("/{id}/phones/{phoneId}")
    public PersonDto addPhone(@PathVariable Long id, @PathVariable Long phoneId) {

        PhoneDto phoneDto = phoneService.getById(phoneId);

        return personService.addElement(phoneDto, id);
    }

    @PutMapping("/{id}/removePhones/{phoneId}")
    public PersonDto removePhone(@PathVariable Long id, @PathVariable Long phoneId) {

        PhoneDto phoneDto = phoneService.getById(phoneId);

        return personService.removeElement(phoneDto, id);
    }

}
