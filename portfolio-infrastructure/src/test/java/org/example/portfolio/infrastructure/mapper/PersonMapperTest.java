package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.ImageDto;
import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {
        org.example.portfolio.domain.data.PersonDto.class,
        org.example.portfolio.infrastructure.entity.ImageEntity.class,
        org.example.portfolio.infrastructure.entity.PersonEntity.class
})
public class PersonMapperTest {

    @Test
    public void whenMapPersonEntityWithDeepMapping_thenConvertsToPersonDTO() {

        PersonEntity personEntity = new PersonEntity(
                1L,
                "Cristian Quinto",
                28,
                "Jr Full Stack Developer",
                "ezequielqmacias@gmail.com",
                "This is a simple example of my summary.",

                new ImageEntity(
                        1L,
                        "https://ui-avatars.com/api/?name=Cristian+Quinto&size=255"
                )
        );

        PersonDto personDto = PersonMapper.PERSON_INSTANCE.mapEntityToDto(personEntity);

        assertEquals(personEntity.getImageEntity().getId(), personDto.getImage().getId());

        assertEquals(personEntity.getImageEntity().getPath(), personDto.getImage().getPath());
    }

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

        PersonEntity personEntity = PersonMapper.PERSON_INSTANCE.mapDtoToEntity(personDto);

        assertEquals(personDto.getImage().getId(), personEntity.getImageEntity().getId());

        assertEquals(personDto.getImage().getPath(), personEntity.getImageEntity().getPath());
    }

}
