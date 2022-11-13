package org.example.portfolio.domain.port.out;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;

import org.springframework.stereotype.Repository;

@Repository
public interface ImagePersistencePort extends DomainInteractPortUseCase<ImageDto, Long> {
}
