package org.example.portfolio.domain.port.out;

import org.example.portfolio.domain.model.PersonDto;

import org.example.portfolio.domain.port.GenericPersistencePort;

public interface PersonPersistencePort extends GenericPersistencePort<PersonDto, Long> {
}
