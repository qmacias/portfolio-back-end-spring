package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

@Component
public interface CollectionModelMapper<DtoCollection, EntityCollection> {

    DtoCollection mapEntitySetToDtoSet(EntityCollection sourceEntitySet);

    EntityCollection mapDtoSetToEntitySet(DtoCollection sourceDtoSet);

}
