package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.AddressDto;
import org.example.portfolio.domain.common.GenericPersistencePort;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressPersistencePort extends GenericPersistencePort<AddressDto, String> {
}
