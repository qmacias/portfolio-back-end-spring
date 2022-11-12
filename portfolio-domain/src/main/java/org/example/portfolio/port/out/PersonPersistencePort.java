package org.example.portfolio.port.out;

import org.example.portfolio.data.PersonDto;

import org.example.portfolio.port.GenericPersistencePort;

public interface PersonPersistencePort extends GenericPersistencePort<PersonDto, Long> {
}
