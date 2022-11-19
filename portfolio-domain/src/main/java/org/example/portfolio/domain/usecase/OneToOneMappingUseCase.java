package org.example.portfolio.domain.usecase;

import org.springframework.stereotype.Component;

@Component
public interface OneToOneMappingUseCase<P, C, K> {

    P assignDetails(C childDto, K parentId);

}
