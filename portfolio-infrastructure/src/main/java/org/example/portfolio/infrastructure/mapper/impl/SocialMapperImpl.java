package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.SocialDto;

import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.example.portfolio.infrastructure.mapper.SocialMapper;

import java.util.List;

import com.google.common.collect.Lists;

public class SocialMapperImpl implements SocialMapper {

    public SocialMapperImpl() {
    }

    @Override
    public SocialEntity mapDtoToEntity(SocialDto socialDto) {
        return SocialEntity.of(socialDto.getId(), socialDto.getLink());
    }

    @Override
    public SocialDto mapEntityToDto(SocialEntity socialEntity) {
        return SocialDto.of(socialEntity.getId(), socialEntity.getLink());
    }

    @Override
    public List<SocialDto> mapEntityListToDtoList(List<SocialEntity> socialEntityList) {

        List<SocialDto> socialDtoList = Lists.newArrayList();

        socialEntityList.forEach(socialEntity -> socialDtoList.add(
                this.mapEntityToDto(socialEntity)
        ));

        return socialDtoList;
    }

    @Override
    public List<SocialEntity> mapDtoListToEntityList(List<SocialDto> socialDtoList) {

        List<SocialEntity> socialEntities = Lists.newArrayList();

        socialDtoList.forEach(socialDto -> socialEntities.add(
                this.mapDtoToEntity(socialDto)
        ));

        return socialEntities;
    }

}
