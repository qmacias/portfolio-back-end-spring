package org.example.portfolio.adapter;

import org.example.portfolio.data.ImageDto;
import org.example.portfolio.port.out.ImagePersistencePort;

import org.example.portfolio.repository.ImageRepository;

import java.util.List;

public class ImageJpaAdapter implements ImagePersistencePort {

    private ImageRepository imageRepository;

    public ImageJpaAdapter(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<ImageDto> findAll() {
        return null;
    }

    @Override
    public ImageDto findById(Long id) {
        return null;
    }

    @Override
    public ImageDto save(ImageDto image) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }

}
