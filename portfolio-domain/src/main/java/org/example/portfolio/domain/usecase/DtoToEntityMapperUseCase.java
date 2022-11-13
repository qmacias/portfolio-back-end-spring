package org.example.portfolio.domain.usecase;

import org.springframework.stereotype.Component;

@Component
public interface DtoToEntityMapperUseCase<D, E> {

    E mapDtoToEntity(D sourceDto);

}
