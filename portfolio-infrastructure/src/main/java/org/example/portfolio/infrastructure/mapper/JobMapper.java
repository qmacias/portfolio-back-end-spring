package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.JobDto;
import org.example.portfolio.domain.common.GenericModelMapper;

import org.example.portfolio.infrastructure.entity.JobEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public abstract class JobMapper extends GenericModelMapper<JobDto, JobEntity> {
    public static final JobMapper INSTANCE = ModelMapperFactory.getFactory().getJobMapperInstance();
}
