package org.example.portfolio.infrastructure.repository;

import org.example.portfolio.infrastructure.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, String> {
}
