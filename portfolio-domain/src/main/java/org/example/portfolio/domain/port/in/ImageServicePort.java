package org.example.portfolio.domain.port.in;

import org.example.portfolio.domain.model.ImageDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageServicePort {

    List<ImageDto> getAllImages();

    ImageDto getImage(Long id);

    ImageDto addImage(ImageDto imageDto);

    void deleteImage(Long id);

}
