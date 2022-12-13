package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.DurationEntity;

import java.util.Set;
import java.util.HashSet;

public interface DurationRepository extends JpaRepository<DurationEntity, String> {

    default Set<DurationEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
