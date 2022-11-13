package org.example.portfolio.domain.port.in;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;
import org.example.portfolio.domain.usecase.OneToOneMappingUseCase;

import org.springframework.stereotype.Service;


@Service
public interface PersonServicePort
    extends DomainInteractPortUseCase<PersonDto, Long>, OneToOneMappingUseCase<PersonDto, ImageDto, Long> {
}
