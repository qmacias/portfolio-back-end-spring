package org.example.portfolio.controller;

import org.example.portfolio.data.ImageDto;
import org.example.portfolio.port.in.ImageServicePort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/images")
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
    public ImageDto addImage(@RequestBody ImageDto image) {
        return imageService.addImage(image);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable Long id) {
        imageService.deleteImage(id);
    }

}