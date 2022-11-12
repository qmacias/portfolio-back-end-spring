package org.example.portfolio.infrastructure.usecase;

public interface EntityToDtoUseCase<E, D> {

    D mapEntityToDto(E sourceEntity);

}
