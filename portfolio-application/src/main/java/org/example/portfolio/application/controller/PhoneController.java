package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.port.input.PhoneServicePort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/phones")
public class PhoneController {

    private final PhoneServicePort phoneService;

    @Autowired
    public PhoneController(PhoneServicePort phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping
    public List<PhoneDto> getAllPhones() {
        return phoneService.getAll();
    }

    @GetMapping("/{id}")
    public PhoneDto getPhoneById(@PathVariable Long id) {
        return phoneService.getById(id);
    }

    @PostMapping
    public PhoneDto createOrUpdatePhone(@RequestBody PhoneDto phoneDto) {
        return phoneService.createOrUpdate(phoneDto);
    }

    @DeleteMapping("/{id}")
    public void removePhoneById(@PathVariable Long id) {
        phoneService.removeById(id);
    }

}
