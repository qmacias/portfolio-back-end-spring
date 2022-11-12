package org.example.portfolio.service;

import org.example.portfolio.data.ImageDto;

import org.example.portfolio.port.in.ImageServicePort;
import org.example.portfolio.port.out.ImagePersistencePort;

import java.util.List;

public class ImageService implements ImageServicePort {

    private final ImagePersistencePort imagePersistencePort;

    public ImageService(ImagePersistencePort imagePersistencePort) {
        this.imagePersistencePort = imagePersistencePort;
    }

    @Override
    public List<ImageDto> getAllImages() {
        return imagePersistencePort.findAll();
    }

    @Override
    public ImageDto getImage(Long id) {
        return imagePersistencePort.findById(id);
    }

    @Override
    public ImageDto addImage(ImageDto image) {
        image.setId(0L);
        return imagePersistencePort.save(image);
    }

    @Override
    public void deleteImage(Long id) {
        imagePersistencePort.deleteById(id);
    }

}
