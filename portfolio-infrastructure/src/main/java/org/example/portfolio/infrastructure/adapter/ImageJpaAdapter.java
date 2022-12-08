package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.ImagePersistencePort;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.mapper.ImageMapper;
import org.example.portfolio.infrastructure.repository.ImageRepository;

import java.util.List;

public class ImageJpaAdapter implements ImagePersistencePort {

    private final ImageRepository imageRepository;

    public ImageJpaAdapter(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<ImageDto> getAll() {
        List<ImageEntity> imageEntityList = imageRepository.findAll();
        return ImageMapper.INSTANCE.mapEntityListToDtoList(imageEntityList);
    }

    @Override
    public ImageDto getById(String id) {
        ImageEntity imageEntity = imageRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Image id: " + id));
        return ImageMapper.INSTANCE.mapEntityToDto(imageEntity);
    }

    @Override
    public ImageDto createOrUpdate(ImageDto imageDto) {
        ImageEntity imageEntity = ImageMapper.INSTANCE.mapDtoToEntity(imageDto);
        return ImageMapper.INSTANCE.mapEntityToDto(imageRepository.save(imageEntity));
    }

    @Override
    public void removeById(String id) {
        imageRepository.deleteById(id);
    }

}
