package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.SocialEntity;

import java.util.Set;
import java.util.HashSet;

public interface SocialRepository extends JpaRepository<SocialEntity, String> {

    default Set<SocialEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
