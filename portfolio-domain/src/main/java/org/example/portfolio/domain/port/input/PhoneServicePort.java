package org.example.portfolio.domain.port.input;

import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface PhoneServicePort extends DomainInteractPortUseCase<PhoneDto, Long> {
}