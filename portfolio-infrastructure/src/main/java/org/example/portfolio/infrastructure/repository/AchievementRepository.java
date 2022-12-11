package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.AchievementEntity;

public interface AchievementRepository extends JpaRepository<AchievementEntity, String> {
}
