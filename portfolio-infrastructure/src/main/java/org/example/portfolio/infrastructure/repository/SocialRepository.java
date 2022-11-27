package org.example.portfolio.infrastructure.repository;

import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialRepository extends JpaRepository<SocialEntity, String> {
}
