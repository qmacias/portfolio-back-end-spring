package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.common.RequestModelMapper;
import org.example.portfolio.domain.common.ResponseModelMapper;
import org.example.portfolio.infrastructure.entity.PersonEntity;

public interface PersonMapper extends
        RequestModelMapper<PersonDto, PersonEntity>, ResponseModelMapper<PersonEntity, PersonDto> {
}
