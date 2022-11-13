package org.example.portfolio.infrastructure.usecase;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DtoToEntityUseCase<D, E> {

    E mapDtoToEntity(D sourceDto);

}
