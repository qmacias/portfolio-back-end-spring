package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        org.example.portfolio.domain.data.ImageDto.class
})
public class ImageDtoToImageEntityMapperTest {

    @Test
    public void whenMapImageDtoWithExactMatch_thenConvertsToImageEntity() {

        ImageDto imageDto = new ImageDto(
                1L,
                "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
        );

        ImageEntity imageEntity =
                ImageDtoToImageEntityMapper.TO_IMAGE_ENTITY_MAPPER.mapDtoToEntity(imageDto);

        assertEquals(imageDto.getId(), imageEntity.getId());

        assertEquals(imageDto.getPath(), imageEntity.getPath());
    }

}
