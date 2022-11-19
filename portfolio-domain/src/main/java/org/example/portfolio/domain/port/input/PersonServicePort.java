package org.example.portfolio.domain.port.input;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.model.PhoneDto;

import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;
import org.example.portfolio.domain.usecase.OneToManyMappingUseCase;
import org.example.portfolio.domain.usecase.OneToOneMappingUseCase;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface PersonServicePort extends DomainInteractPortUseCase<PersonDto, Long>,
    OneToOneMappingUseCase<PersonDto, ImageDto, Long>, OneToManyMappingUseCase<PersonDto, PhoneDto, Long> {
}
