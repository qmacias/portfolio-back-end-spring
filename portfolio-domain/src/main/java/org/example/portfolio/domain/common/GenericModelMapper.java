package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GenericModelMapper<Dto, Entity> {

    Entity mapDtoToEntity(Dto sourceDto);

    Dto mapEntityToDto(Entity sourceEntity);

    List<Dto> mapEntityListToDtoList(List<Entity> sourceEntityList);

}
