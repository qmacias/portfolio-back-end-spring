package org.example.portfolio.infrastructure.mapper.impl;

import org.example.portfolio.domain.model.SocialDto;
import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.example.portfolio.infrastructure.mapper.SocialMapper;

import java.util.ArrayList;
import java.util.List;

public class SocialMapperImpl implements SocialMapper {

    public SocialMapperImpl() {
    }

    @Override
    public SocialEntity mapDtoToEntity(SocialDto socialDto) {
        return SocialEntity.of(
                socialDto.getId(),
                socialDto.getLink()
        );
    }

    @Override
    public SocialDto mapEntityToDto(SocialEntity socialEntity) {
        return SocialDto.of(
                socialEntity.getId(),
                socialEntity.getLink()
        );
    }

    @Override
    public List<SocialDto> mapEntityListToDtoList(List<SocialEntity> socialEntityList) {

        List<SocialDto> socialDtoList = new ArrayList<>();

        socialEntityList.forEach(socialEntity -> socialDtoList.add(
            this.mapEntityToDto(socialEntity)
        ));

        return socialDtoList;
    }

}
