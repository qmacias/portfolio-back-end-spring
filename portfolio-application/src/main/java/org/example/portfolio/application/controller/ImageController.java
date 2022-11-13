package org.example.portfolio.application.controller;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.port.in.ImageServicePort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public ImageDto getImage(@PathVariable Long id) {
        return imageService.getById(id);
    }

    @PostMapping
    public ImageDto addImage(@RequestBody ImageDto imageDto) {
        return imageService.create(imageDto);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable Long id) {
        imageService.removeById(id);
    }

}
