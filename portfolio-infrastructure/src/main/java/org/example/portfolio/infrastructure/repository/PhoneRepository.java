package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.portfolio.infrastructure.entity.PhoneEntity;

public interface PhoneRepository extends JpaRepository<PhoneEntity, String> {
}
