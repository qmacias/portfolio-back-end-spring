package org.example.portfolio.application.controller;

import org.example.portfolio.domain.data.ImageDto;
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
        return imageService.getAllImages();
    }

    @GetMapping("/{id}")
    public ImageDto getImage(@PathVariable Long id) {
        return imageService.getImage(id);
    }

    @PostMapping
    public ImageDto addImage(@RequestBody ImageDto imageDto) {
        return imageService.addImage(imageDto);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable Long id) {
        imageService.deleteImage(id);
    }

}
