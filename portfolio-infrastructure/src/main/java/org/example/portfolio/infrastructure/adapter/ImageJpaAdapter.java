package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.impl.ImageMapperImpl;
import org.example.portfolio.infrastructure.repository.ImageRepository;

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
            return ImageMapperImpl.IMAGE_INSTANCE.mapEntityToDto(imageEntity.get());
        }

        return null;
    }

    @Override
    public ImageDto save(ImageDto imageDto) {

        ImageEntity imageEntity = ImageMapperImpl.IMAGE_INSTANCE.mapDtoToEntity(imageDto);

        ImageEntity imageEntitySaved = imageRepository.save(imageEntity);

        return ImageMapperImpl.IMAGE_INSTANCE.mapEntityToDto(imageEntitySaved);
    }

    @Override
    public void deleteById(Long id) {
        imageRepository.deleteById(id);
    }

}
