package org.example.portfolio.domain.service;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.domain.port.in.ImageServicePort;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

import java.util.List;

public class ImageServiceImpl implements ImageServicePort {

    private final ImagePersistencePort imagePersistencePort;

    public ImageServiceImpl(ImagePersistencePort imagePersistencePort) {
        this.imagePersistencePort = imagePersistencePort;
    }

    @Override
    public List<ImageDto> getAll() {
        return imagePersistencePort.getAll();
    }

    @Override
    public ImageDto getById(Long id) {
        return imagePersistencePort.getById(id);
    }

    @Override
    public ImageDto createOrUpdate(ImageDto imageDto) {
        return imagePersistencePort.createOrUpdate(imageDto);
    }

    @Override
    public void removeById(Long id) {
        imagePersistencePort.removeById(id);
    }

}
