package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import java.util.Set;
import java.util.HashSet;

public interface ImageRepository extends JpaRepository<ImageEntity, String> {

    default Set<ImageEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
