package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.modelmapper.TypeMap;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        org.example.portfolio.domain.data.PersonDto.class,
        org.example.portfolio.infrastructure.entity.ImageEntity.class,
        org.example.portfolio.infrastructure.entity.PersonEntity.class
})
public class MapperTest {

    @Test
    public void whenMapPersonEntityWithDeepMapping_thenConvertsToDTO() {

        TypeMap<PersonEntity, PersonDto> propertyMapper =
                Mapper.INSTANCE.createTypeMap(PersonEntity.class, PersonDto.class);

        propertyMapper.addMappings(
                mapper -> mapper.map(src -> src.getImageEntity().getPath(), PersonDto::setImage)
        );

        PersonEntity personEntity = new PersonEntity(
                1L,
                "Cristian Quinto",
                28,
                "Jr Full Stack Developer",
                "ezequielqmacias@gmail.com",
                "This is a simple example of my summary."
        );

        ImageEntity imageEntity = new ImageEntity(1L, "some path...");

        personEntity.setImageEntity(imageEntity);

        PersonDto personDto = Mapper.INSTANCE.map(personEntity, PersonDto.class);

        assertEquals(personEntity.getImageEntity().getPath(), personDto.getImage());
    }

    @Test
    public void whenMapPersonEntityWithExactMatch_thenConvertsToDTO() {

        ImageEntity imageEntity = new ImageEntity(1L, "some path...");

        ImageDto imageDto = Mapper.INSTANCE.map(imageEntity, ImageDto.class);

        assertEquals(imageEntity.getId(), imageDto.getId());
        assertEquals(imageEntity.getPath(), imageDto.getPath());
    }

}
