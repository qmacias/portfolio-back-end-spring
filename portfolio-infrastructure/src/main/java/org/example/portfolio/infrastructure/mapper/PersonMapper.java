package org.example.portfolio.infrastructure.mapper;

import org.example.portfolio.domain.model.PersonDto;
import org.example.portfolio.domain.common.RequestModelMapperComponent;
import org.example.portfolio.domain.common.ResponseModelMapperComponent;
import org.example.portfolio.infrastructure.entity.PersonEntity;

public interface PersonMapper extends
        RequestModelMapperComponent<PersonDto, PersonEntity>, ResponseModelMapperComponent<PersonEntity, PersonDto> {
}
