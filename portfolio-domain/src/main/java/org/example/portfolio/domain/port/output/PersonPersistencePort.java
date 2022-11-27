package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.common.GenericPersistence;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonPersistencePort extends GenericPersistence<PersonDto, String> {
}
