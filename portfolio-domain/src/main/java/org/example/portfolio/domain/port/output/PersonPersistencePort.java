package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.port.GenericPersistencePort;

public interface PersonPersistencePort extends GenericPersistencePort<PersonDto, String> {
}
