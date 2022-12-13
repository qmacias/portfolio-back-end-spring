package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.PhoneEntity;

import java.util.HashSet;
import java.util.Set;

public interface PhoneRepository extends JpaRepository<PhoneEntity, String> {

    default Set<PhoneEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
