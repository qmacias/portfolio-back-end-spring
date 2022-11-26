package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.usecase.DomainInteractPortUseCase;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonPersistencePort extends DomainInteractPortUseCase<PersonDto, String> {
}
