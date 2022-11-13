package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        org.example.portfolio.domain.data.ImageDto.class
})
public class ImageEntityToImageDtoMapperTest {

    @Test
    public void whenMapImageEntityWithExactMatch_thenConvertsToImageDto() {

        ImageEntity imageEntity = new ImageEntity(
                1L,
                "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
        );

        ImageDto imageDto = ImageEntityToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityToDto(imageEntity);

        assertEquals(imageEntity.getId(), imageDto.getId());

        assertEquals(imageEntity.getPath(), imageDto.getPath());
    }

    @Test
    public void whenMapImageEntityListWithExactMatch_thenConvertsToImageDtoList() {

        ImageEntity imageEntity1 = new ImageEntity(
                1L,
                "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
        );

        ImageEntity imageEntity2 = new ImageEntity(
                1L,
                "https://ui-avatars.com/api/?name=Pepe+Honguito&size=255"
        );

        List<ImageEntity> imageEntityList = new ArrayList<>();

        imageEntityList.add(imageEntity1);

        imageEntityList.add(imageEntity2);

        List<ImageDto> imageDtoList = ImageEntityToImageDtoMapper
                .TO_IMAGE_DTO_MAPPER.mapEntityListToDtoList(imageEntityList);

//        assertEquals(imageEntityList, imageDtoList);
    }

}
