package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.UUID;

@Component
public abstract class GenericModelMapper<Dto, Entity> {

    public abstract Entity mapDtoToEntity(Dto sourceDto);

    public abstract Dto mapEntityToDto(Entity sourceEntity);

    public abstract Set<Dto> mapEntitySetToDtoSet(Set<Entity> sourceEntitySet);

    public abstract Set<Entity> mapDtoSetToEntitySet(Set<Dto> sourceDtoSet);

    public String checkIdentity(String id) {
        if (id == null) {
            return UUID.randomUUID().toString();
        }
        return id;
    }

}
