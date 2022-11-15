package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.exception.NotFoundException;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.port.out.ImagePersistencePort;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.example.portfolio.infrastructure.mapper.ToImageDtoOrEntityMapper;

import org.example.portfolio.infrastructure.repository.ImageRepository;

import java.util.List;

public class ImageJpaAdapter implements ImagePersistencePort {

    private final ImageRepository imageRepository;

    private final ToImageDtoOrEntityMapper toImageDtoOrEntityMapper;

    public ImageJpaAdapter(
            ImageRepository imageRepository,
            ToImageDtoOrEntityMapper toImageDtoOrEntityMapper
    ) {
        this.imageRepository = imageRepository;
        this.toImageDtoOrEntityMapper = toImageDtoOrEntityMapper;
    }

    @Override
    public List<ImageDto> getAll() {

        List<ImageEntity> imageEntityList = imageRepository.findAll();

        return toImageDtoOrEntityMapper.mapEntityListToDtoList(imageEntityList);
    }

    @Override
    public ImageDto getById(Long id) {

        ImageEntity imageEntity = imageRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Image id: " + id));

        return toImageDtoOrEntityMapper.mapEntityToDto(imageEntity);
    }

    @Override
    public ImageDto createOrUpdate(ImageDto imageDto) {

        ImageEntity imageEntity = toImageDtoOrEntityMapper.mapDtoToEntity(imageDto);

        ImageEntity imageEntitySaved = imageRepository.save(imageEntity);

        return toImageDtoOrEntityMapper.mapEntityToDto(imageEntitySaved);
    }

    @Override
    public void removeById(Long id) {
        imageRepository.deleteById(id);
    }

}
