package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

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
    public ImageDto save(ImageDto imageDto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }

}
