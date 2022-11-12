package org.example.portfolio.infrastructure.repository;

import org.example.portfolio.infrastructure.entity.ImageEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
