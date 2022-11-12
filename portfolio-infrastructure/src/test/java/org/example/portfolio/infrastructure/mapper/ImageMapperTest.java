package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.example.portfolio.infrastructure.mapper.impl.ImageMapperImpl;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        org.example.portfolio.domain.data.ImageDto.class,
        org.example.portfolio.infrastructure.entity.ImageEntity.class
})
public class ImageMapperTest {

    @Test
    public void whenMapImageEntityWithExactMatch_thenConvertsToImageDto() {

        ImageEntity imageEntity = new ImageEntity(
                1L,
                "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
        );

        ImageDto imageDto = ImageMapperImpl.IMAGE_INSTANCE.mapEntityToDto(imageEntity);

        assertEquals(imageEntity.getId(), imageDto.getId());

        assertEquals(imageEntity.getPath(), imageDto.getPath());
    }

    @Test
    public void whenMapImageDtoWithExactMatch_thenConvertsToImageEntity() {

        ImageDto imageDto = new ImageDto(
                1L,
                "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
        );

        ImageEntity imageEntity = ImageMapperImpl.IMAGE_INSTANCE.mapDtoToEntity(imageDto);

        assertEquals(imageDto.getId(), imageEntity.getId());

        assertEquals(imageDto.getPath(), imageEntity.getPath());
    }

}
