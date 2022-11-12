package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.data.PersonDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {
        org.example.portfolio.domain.data.PersonDto.class
})
public class PersonEntityToPersonDtoMapperTest {

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

        PersonDto personDto =
                PersonEntityToPersonDtoMapper.TO_PERSON_DTO_MAPPER.mapEntityToDto(personEntity);

        assertEquals(personEntity.getImageEntity().getId(), personDto.getImage().getId());

        assertEquals(personEntity.getImageEntity().getPath(), personDto.getImage().getPath());
    }

}
