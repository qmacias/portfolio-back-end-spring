package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.common.GenericModelMapper;
import org.example.portfolio.domain.model.SocialDto;
import org.example.portfolio.infrastructure.entity.SocialEntity;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public interface SocialMapper extends GenericModelMapper<SocialDto, SocialEntity> {

    SocialMapper INSTANCE = ModelMapperFactory.getFactory().getSocialMapperInstance();

}
