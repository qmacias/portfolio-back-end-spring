package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GenericModelMapper<D, E> {

    E mapDtoToEntity(D sourceDto);

    D mapEntityToDto(E sourceEntity);

    List<D> mapEntityListToDtoList(List<E> sourceEntityList);

}
