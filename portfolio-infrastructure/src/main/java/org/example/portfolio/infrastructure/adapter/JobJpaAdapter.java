package org.example.portfolio.infrastructure.adapter;

import org.example.portfolio.domain.model.JobDto;
import org.example.portfolio.domain.exception.NotFoundException;
import org.example.portfolio.domain.port.output.JobPersistencePort;

import org.example.portfolio.infrastructure.entity.JobEntity;
import org.example.portfolio.infrastructure.mapper.JobMapper;
import org.example.portfolio.infrastructure.repository.JobRepository;

import java.util.Set;

public class JobJpaAdapter implements JobPersistencePort {

    private final JobRepository jobRepository;

    public JobJpaAdapter(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Set<JobDto> getAll() {
        Set<JobEntity> jobEntities = jobRepository.findAllSet();
        return JobMapper.INSTANCE.mapEntitySetToDtoSet(jobEntities);
    }

    @Override
    public JobDto getById(String id) {
        JobEntity jobEntity = jobRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Job id:" + id));
        return JobMapper.INSTANCE.mapEntityToDto(jobEntity);
    }

    @Override
    public JobDto createOrUpdate(JobDto jobDto) {
        JobEntity jobEntity = JobMapper.INSTANCE.mapDtoToEntity(jobDto);
        return JobMapper.INSTANCE.mapEntityToDto(jobRepository.save(jobEntity));
    }

    @Override
    public void removeById(String id) {
        jobRepository.deleteById(id);
    }

}
