package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface ObjectModelMapper<ObjectDto, ObjectEntity> {

    ObjectEntity mapDtoToEntity(ObjectDto sourceDto);

    ObjectDto mapEntityToDto(ObjectEntity sourceEntity);

    default String checkIdentity(String id) {
        return id == null ? UUID.randomUUID().toString() : id;
    }

}
