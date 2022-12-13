package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.JobDto;
import org.example.portfolio.domain.common.GenericPersistencePort;

import org.springframework.stereotype.Repository;

@Repository
public interface JobPersistencePort extends GenericPersistencePort<JobDto, String> {
}
