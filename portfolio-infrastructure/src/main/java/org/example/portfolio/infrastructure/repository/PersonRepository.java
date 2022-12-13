package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import java.util.Set;
import java.util.HashSet;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, String> {

    default Set<PersonEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

    Optional<PersonEntity> findByEmail(String email);

}
