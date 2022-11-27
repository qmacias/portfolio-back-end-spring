package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.PhoneDto;
import org.example.portfolio.domain.common.GenericPersistence;

import org.springframework.stereotype.Repository;

@Repository
public interface PhonePersistencePort extends GenericPersistence<PhoneDto, String> {
}
