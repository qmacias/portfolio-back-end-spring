package org.example.portfolio.infrastructure.usecase;

import org.springframework.stereotype.Component;

@Component
public interface EntityToDtoUseCase<E, D> {

    D mapEntityToDto(E sourceEntity);

}
