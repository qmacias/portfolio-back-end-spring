package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ResponseModelMapperComponent<S, D> {

    D mapEntityToDto(S sourceEntity);

    List<D> mapEntityListToDtoList(List<S> sourceEntityList);

}
