package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public abstract class GenericModelMapper<Dto, Entity> {

    public abstract Entity mapDtoToEntity(Dto sourceDto);

    public abstract Dto mapEntityToDto(Entity sourceEntity);

    public abstract List<Dto> mapEntityListToDtoList(List<Entity> sourceEntityList);

    public abstract List<Entity> mapDtoListToEntityList(List<Dto> sourceDtoList);

    public String checkIdentity(String id) {
        if (id == null) {
            return UUID.randomUUID().toString();
        }
        return id;
    }

}
