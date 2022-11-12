package org.example.portfolio.port.in;

import org.example.portfolio.data.ImageDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageServicePort {

    List<ImageDto> getAllImages();

    ImageDto getImage(Long id);

    ImageDto addImage(ImageDto image);

    void deleteImage(Long id);

}
