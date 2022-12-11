package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, String> {
}
