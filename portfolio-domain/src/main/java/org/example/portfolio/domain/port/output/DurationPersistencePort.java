package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.DurationDto;
import org.example.portfolio.domain.common.GenericPersistencePort;

import org.springframework.stereotype.Repository;

@Repository
public interface DurationPersistencePort extends GenericPersistencePort<DurationDto, String> {
}
