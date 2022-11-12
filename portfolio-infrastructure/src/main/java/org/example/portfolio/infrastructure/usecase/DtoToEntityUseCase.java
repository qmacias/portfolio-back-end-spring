package org.example.portfolio.infrastructure.usecase;

public interface DtoToEntityUseCase<D, E> {

    E mapDtoToEntity(D sourceDto);

}
