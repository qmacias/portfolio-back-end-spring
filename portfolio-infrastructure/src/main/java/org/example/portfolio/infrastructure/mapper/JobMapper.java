package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.JobDto;
import org.example.portfolio.domain.common.ObjectModelMapper;
import org.example.portfolio.domain.common.CollectionModelMapper;

import org.example.portfolio.infrastructure.entity.JobEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

import java.util.Set;

public interface JobMapper extends
        ObjectModelMapper<JobDto, JobEntity>, CollectionModelMapper<Set<JobDto>, Set<JobEntity>> {
    JobMapper INSTANCE = ModelMapperFactory.getFactory().getJobMapperInstance();
}
