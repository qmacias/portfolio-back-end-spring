package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.AchievementEntity;

import java.util.Set;
import java.util.HashSet;

public interface AchievementRepository extends JpaRepository<AchievementEntity, String> {

    default Set<AchievementEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
