package org.example.portfolio.domain.usecase;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ResponseModelMapperUseCase<S, D> {

    D mapEntityToDto(S sourceEntity);

    List<D> mapEntityListToDtoList(List<S> sourceEntityList);

}
