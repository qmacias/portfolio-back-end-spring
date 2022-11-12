package org.example.portfolio.infrastructure.mapper.usecase;

public interface DtoToEntityUseCase<D, E> {

    E mapDtoToEntity(D sourceDto);

}
