package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

@Component
public interface RequestModelMapper<S, D> {

    D mapDtoToEntity(S sourceDto);

}
