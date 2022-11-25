package org.example.portfolio.infrastructure.repository;

import org.example.portfolio.infrastructure.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {
}
