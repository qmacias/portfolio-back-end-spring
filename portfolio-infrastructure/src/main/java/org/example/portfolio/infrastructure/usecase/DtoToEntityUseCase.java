package org.example.portfolio.infrastructure.usecase;

import org.springframework.stereotype.Component;

@Component
public interface DtoToEntityUseCase<D, E> {

    E mapDtoToEntity(D sourceDto);

}
