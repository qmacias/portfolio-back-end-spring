package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.SocialDto;
import org.example.portfolio.domain.common.ObjectModelMapper;
import org.example.portfolio.domain.common.CollectionModelMapper;

import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

import java.util.Set;

public interface SocialMapper extends
        ObjectModelMapper<SocialDto, SocialEntity>, CollectionModelMapper<Set<SocialDto>, Set<SocialEntity>> {
    SocialMapper INSTANCE = ModelMapperFactory.getFactory().getSocialMapperInstance();
}
