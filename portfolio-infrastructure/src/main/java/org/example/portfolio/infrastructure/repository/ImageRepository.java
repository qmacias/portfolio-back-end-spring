package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, String> {
}
