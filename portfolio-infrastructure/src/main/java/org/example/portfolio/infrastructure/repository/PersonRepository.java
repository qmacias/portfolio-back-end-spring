package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.portfolio.infrastructure.entity.PersonEntity;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, String> {

    Optional<PersonEntity> findByEmail(String email);

}
