package org.example.portfolio.infrastructure.mapper.usecase;

public interface EntityToDtoUseCase<E, D> {

    D mapEntityToDto(E sourceEntity);

}
