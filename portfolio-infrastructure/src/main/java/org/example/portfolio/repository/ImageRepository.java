package org.example.portfolio.repository;

import org.example.portfolio.entity.ImageEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
