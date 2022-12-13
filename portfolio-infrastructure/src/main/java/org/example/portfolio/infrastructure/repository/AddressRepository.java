package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.AddressEntity;

import java.util.Set;
import java.util.HashSet;

public interface AddressRepository extends JpaRepository<AddressEntity, String> {

    default Set<AddressEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
