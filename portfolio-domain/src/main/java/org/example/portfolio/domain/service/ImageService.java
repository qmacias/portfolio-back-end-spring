package org.example.portfolio.domain.service;

import org.example.portfolio.domain.port.in.ImageServicePort;
import org.example.portfolio.domain.port.out.ImagePersistencePort;
import org.example.portfolio.domain.data.ImageDto;

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
    public ImageDto addImage(ImageDto imageDto) {
        imageDto.setId(0L);
        return imagePersistencePort.save(imageDto);
    }

    @Override
    public void deleteImage(Long id) {
        imagePersistencePort.deleteById(id);
    }

}
