package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.data.PersonDto;
import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.entity.PersonEntity;
import org.example.portfolio.infrastructure.mapper.Mapper;
import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

import java.util.List;
import java.util.Optional;

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

        Optional<ImageEntity> imageEntity = imageRepository.findById(id);

        if (imageEntity.isPresent()) {
            return Mapper.INSTANCE.map(imageEntity, ImageDto.class);
        }

        return null;
    }

    @Override
    public ImageDto save(ImageDto imageDto) {

        ImageEntity imageEntity = Mapper.INSTANCE.map(imageDto, ImageEntity.class);

        ImageEntity imageEntitySaved = imageRepository.save(imageEntity);

        return Mapper.INSTANCE.map(imageEntitySaved, ImageDto.class);
    }

    @Override
    public void deleteById(Long id) {
        imageRepository.deleteById(id);
    }

}
