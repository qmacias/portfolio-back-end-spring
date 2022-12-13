package org.example.portfolio.infrastructure.mapper.impl;

import com.google.common.collect.Sets;
import org.example.portfolio.domain.model.SocialDto;

import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.example.portfolio.infrastructure.mapper.SocialMapper;

import java.util.Set;

public class SocialMapperImpl extends SocialMapper {

    public SocialMapperImpl() {
    }

    @Override
    public SocialEntity mapDtoToEntity(SocialDto socialDto) {
        return SocialEntity.of(this.checkIdentity(socialDto.getId()), socialDto.getLink());
    }

    @Override
    public SocialDto mapEntityToDto(SocialEntity socialEntity) {
        return SocialDto.of(socialEntity.getId(), socialEntity.getLink());
    }

    @Override
    public Set<SocialDto> mapEntitySetToDtoSet(Set<SocialEntity> socialEntities) {

        Set<SocialDto> socialDtoSet = Sets.newHashSet();

        socialEntities.forEach(socialEntity -> socialDtoSet.add(
                this.mapEntityToDto(socialEntity)
        ));

        return socialDtoSet;
    }

    @Override
    public Set<SocialEntity> mapDtoSetToEntitySet(Set<SocialDto> socialDtoSet) {

        Set<SocialEntity> socialEntities = Sets.newHashSet();

        socialDtoSet.forEach(socialDto -> socialEntities.add(
                this.mapDtoToEntity(socialDto)
        ));

        return socialEntities;
    }

}
