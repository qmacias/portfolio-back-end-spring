package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.DurationEntity;

public interface DurationRepository extends JpaRepository<DurationEntity, String> {
}
