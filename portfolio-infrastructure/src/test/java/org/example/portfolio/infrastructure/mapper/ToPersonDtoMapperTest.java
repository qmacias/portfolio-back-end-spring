package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.infrastructure.entity.ImageEntity;
import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = {
        org.example.portfolio.domain.model.PersonDto.class
})
public class ToPersonDtoMapperTest {

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

        PersonDto personDto = ToPersonDtoMapper
                .TO_PERSON_DTO_MAPPER.mapEntityToDto(personEntity);

        assertEquals(
                personEntity.getImageEntity().getId(), personDto.getImage().getId()
        );

        assertEquals(
                personEntity.getImageEntity().getPath(), personDto.getImage().getPath()
        );
    }

    @Test
    public void whenMapPersonDtoWithDeepMapping_thenConvertsToPersonEntity() {

        PersonEntity personEntity1 = new PersonEntity(
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

        PersonEntity personEntity2 = new PersonEntity(
                2L,
                "Pepe Honguito",
                30,
                "Sr Full Stack Developer",
                "pepehonguito@gmail.com",
                "This is another example of summary.",

                new ImageEntity(
                        2L,
                        "https://ui-avatars.com/api/?name=Pepe+Honguito&size=255"
                )
        );

        List<PersonEntity> personEntityList = new ArrayList<>();

        personEntityList.add(personEntity1);

        personEntityList.add(personEntity2);

        List<PersonDto> personDtoList = ToPersonDtoMapper
                .TO_PERSON_DTO_MAPPER.mapEntityListToDtoList(personEntityList);

//        assertEquals(personEntityList, personDtoList);
    }

}
