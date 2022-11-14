package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.NotFoundException;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.example.portfolio.infrastructure.mapper.ToImageEntityMapper;
import org.example.portfolio.infrastructure.mapper.ToImageDtoMapper;

import org.example.portfolio.infrastructure.repository.ImageRepository;

import java.util.List;

public class ImageJpaAdapter implements ImagePersistencePort {

    private ImageRepository imageRepository;

    public ImageJpaAdapter(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<ImageDto> getAll() {

        List<ImageEntity> imageEntityList = imageRepository.findAll();

        return ToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityListToDtoList(imageEntityList);
    }

    @Override
    public ImageDto getById(Long id) {

        ImageEntity imageEntity = imageRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Image id: " + id));

        return ToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityToDto(imageEntity);
    }

    @Override
    public ImageDto createOrUpdate(ImageDto imageDto) {

        ImageEntity imageEntity = ToImageEntityMapper
                .TO_IMAGE_ENTITY_MAPPER.mapDtoToEntity(imageDto);

        ImageEntity imageEntitySaved = imageRepository.save(imageEntity);

        return ToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityToDto(imageEntitySaved);
    }

    @Override
    public void removeById(Long id) {
        imageRepository.deleteById(id);
    }

}
