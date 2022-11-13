package org.example.portfolio.domain.usecase;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EntityToDtoMapperUseCase<E, D> {

    D mapEntityToDto(E sourceEntity);

    List<D> mapEntityListToDtoList(List<E> sourceEntityList);

}
