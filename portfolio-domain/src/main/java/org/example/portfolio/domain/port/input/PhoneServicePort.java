package org.example.portfolio.domain.port.input;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;

import org.springframework.stereotype.Service;

@Service
public interface PhoneServicePort extends DomainInteractPortUseCase<PhoneDto, Long> {
}
