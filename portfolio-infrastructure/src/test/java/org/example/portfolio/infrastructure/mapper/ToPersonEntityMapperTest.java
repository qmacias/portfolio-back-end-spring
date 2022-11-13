package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {
        org.example.portfolio.domain.model.ImageDto.class,
        org.example.portfolio.domain.model.PersonDto.class
})
public class ToPersonEntityMapperTest {

    @Test
    public void whenMapPersonDtoWithDeepMapping_thenConvertsToPersonEntity() {

        PersonDto personDto = new PersonDto(
                1L,
                "Cristian Quinto",
                28,
                "Jr Full Stack Developer",
                "ezequielqmacias@gmail.com",
                "This is a simple example of my summary.",

                new ImageDto(
                        1L,
                        "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
                )
        );

        PersonEntity personEntity =
                ToPersonEntityMapper.TO_PERSON_ENTITY_MAPPER.mapDtoToEntity(personDto);

        assertEquals(personDto.getImage().getId(), personEntity.getImageEntity().getId());

        assertEquals(personDto.getImage().getPath(), personEntity.getImageEntity().getPath());
    }

}
