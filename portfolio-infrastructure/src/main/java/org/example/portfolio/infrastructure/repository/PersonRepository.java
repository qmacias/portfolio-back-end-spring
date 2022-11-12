package org.example.portfolio.infrastructure.repository;

import org.example.portfolio.infrastructure.entity.PersonEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    Optional<PersonEntity> findByEmail(String email);

}
