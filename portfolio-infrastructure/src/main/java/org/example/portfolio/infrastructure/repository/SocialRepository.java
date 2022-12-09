package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.SocialEntity;

public interface SocialRepository extends JpaRepository<SocialEntity, String> {
}
