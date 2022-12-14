package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.UUID;

@Component
public interface GenericModelMapper<Dto, Entity> {

    Entity mapDtoToEntity(Dto sourceDto);

    Dto mapEntityToDto(Entity sourceEntity);

    Set<Dto> mapEntitySetToDtoSet(Set<Entity> sourceEntitySet);

    Set<Entity> mapDtoSetToEntitySet(Set<Dto> sourceDtoSet);

    default String checkIdentity(String id) {
        return id == null ? UUID.randomUUID().toString() : id;
    }

}
