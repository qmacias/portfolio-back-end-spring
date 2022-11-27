package org.example.portfolio.domain.port.output;

import org.example.portfolio.domain.model.ImageDto;
import org.example.portfolio.domain.common.GenericPersistence;

import org.springframework.stereotype.Repository;

@Repository
public interface ImagePersistencePort extends GenericPersistence<ImageDto, String> {
}
