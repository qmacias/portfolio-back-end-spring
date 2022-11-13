package org.example.portfolio.domain.port.in;

import org.example.portfolio.domain.model.ImageDto;

import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;

import org.springframework.stereotype.Service;

@Service
public interface ImageServicePort extends DomainInteractPortUseCase<ImageDto, Long> {
}
