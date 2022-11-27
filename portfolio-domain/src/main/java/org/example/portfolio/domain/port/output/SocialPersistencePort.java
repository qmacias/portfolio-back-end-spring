package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.common.GenericPersistencePort;
import org.example.portfolio.domain.model.SocialDto;

import org.springframework.stereotype.Repository;

@Repository
public interface SocialPersistencePort extends GenericPersistencePort<SocialDto, String> {
}
