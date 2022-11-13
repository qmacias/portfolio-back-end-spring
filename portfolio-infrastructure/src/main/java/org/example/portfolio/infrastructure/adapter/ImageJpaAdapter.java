package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ToImageEntityMapper;
import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.infrastructure.mapper.ToImageDtoMapper;

import java.util.List;
import java.util.Optional;

public class ImageJpaAdapter implements ImagePersistencePort {

    private ImageRepository imageRepository;

    public ImageJpaAdapter(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<ImageDto> findAll() {

        List<ImageEntity> imageEntityList = imageRepository.findAll();

        return ToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityListToDtoList(imageEntityList);
    }

    @Override
    public ImageDto findById(Long id) {

        Optional<ImageEntity> imageEntity = imageRepository.findById(id);

        if (imageEntity.isPresent()) {
            return ToImageDtoMapper
                    .TO_IMAGE_DTO_MAPPER.mapEntityToDto(imageEntity.get());
        }

        return null;
    }

    @Override
    public ImageDto save(ImageDto imageDto) {

        ImageEntity imageEntity = ToImageEntityMapper
                .TO_IMAGE_ENTITY_MAPPER.mapDtoToEntity(imageDto);

        ImageEntity imageEntitySaved = imageRepository.save(imageEntity);

        return ToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityToDto(imageEntitySaved);
    }

    @Override
    public void deleteById(Long id) {
        imageRepository.deleteById(id);
    }

}
