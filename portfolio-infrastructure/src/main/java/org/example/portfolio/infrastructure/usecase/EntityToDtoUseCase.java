package org.example.portfolio.infrastructure.usecase;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EntityToDtoUseCase<E, D> {

    D mapEntityToDto(E sourceEntity);

    List<D> mapEntityListToDtoList(List<E> sourceEntityList);

}
