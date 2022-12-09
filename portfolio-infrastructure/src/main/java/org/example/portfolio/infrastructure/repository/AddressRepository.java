package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, String> {
}
