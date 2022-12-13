package org.example.portfolio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.portfolio.infrastructure.entity.JobEntity;

import java.util.Set;
import java.util.HashSet;

public interface JobRepository extends JpaRepository<JobEntity, String> {

    default Set<JobEntity> findAllSet() {
        return new HashSet<>(findAll());
    }

}
