package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.domain.port.input.ImageServicePort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/images")
public class ImageController {

    private final ImageServicePort imageService;

    @Autowired
    public ImageController(ImageServicePort imageService) {
        this.imageService = imageService;
    }

    @GetMapping
    public List<ImageDto> getAllImages() {
        return imageService.getAll();
    }

    @GetMapping("/{id}")
    public ImageDto getImageById(@PathVariable Long id) {
        return imageService.getById(id);
    }

    @PostMapping
    public ImageDto createOrUpdateImage(@RequestBody ImageDto imageDto) {
        return imageService.createOrUpdate(imageDto);
    }

    @DeleteMapping("/{id}")
    public void removeImageById(@PathVariable Long id) {
        imageService.removeById(id);
    }

}
