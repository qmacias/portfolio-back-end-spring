package org.example.portfolio.domain.usecase;

import org.springframework.stereotype.Component;

@Component
public interface RequestModelMapperUseCase<S, D> {

    D mapDtoToEntity(S sourceDto);

}
