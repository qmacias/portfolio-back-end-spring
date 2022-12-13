package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.JobDto;
import org.example.portfolio.domain.model.JobDtoBuilder;
import org.example.portfolio.domain.util.CustomDateFormatter;

import org.example.portfolio.infrastructure.entity.JobEntity;
import org.example.portfolio.infrastructure.entity.JobEntityBuilder;

import org.example.portfolio.infrastructure.mapper.DurationMapper;
import org.example.portfolio.infrastructure.mapper.JobMapper;
import org.example.portfolio.infrastructure.mapper.AchievementMapper;

import java.util.List;

import com.google.common.collect.Lists;

public class JobMapperImpl extends JobMapper {

    public JobMapperImpl() {
    }

    @Override
    public JobEntity mapDtoToEntity(JobDto jobDto) {
        return new JobEntityBuilder()
                .setId(this.checkIdentity(jobDto.getId()))
                .setPosition(jobDto.getPosition())
                .setDescription(jobDto.getDescription())
                .setDuration(DurationMapper.INSTANCE.mapDtoToEntity(jobDto.getDuration()))
                .setAchievementEntities(AchievementMapper.INSTANCE.mapDtoListToEntityList(jobDto.getAchievementDtoList()))
                .createJobEntity();
    }

    @Override
    public JobDto mapEntityToDto(JobEntity jobEntity) {
        return new JobDtoBuilder()
                .setId(jobEntity.getId())
                .setPosition(jobEntity.getPosition())
                .setDescription(jobEntity.getDescription())
                .setDuration(DurationMapper.INSTANCE.mapEntityToDto(jobEntity.getDurationEntity()))
                .setAchievementDtoList(AchievementMapper.INSTANCE.mapEntityListToDtoList(jobEntity.getAchievementEntities()))
                .createJobDto();
    }

    @Override
    public List<JobDto> mapEntityListToDtoList(List<JobEntity> jobEntities) {

        List<JobDto> jobDtoList = Lists.newArrayList();

        jobEntities.forEach(jobEntity -> jobDtoList.add(
                this.mapEntityToDto(jobEntity)
        ));

        return jobDtoList;
    }

    @Override
    public List<JobEntity> mapDtoListToEntityList(List<JobDto> jobDtoList) {

        List<JobEntity> jobEntities = Lists.newArrayList();

        jobDtoList.forEach(jobDto -> jobEntities.add(
                this.mapDtoToEntity(jobDto)
        ));

        return jobEntities;
    }

}
