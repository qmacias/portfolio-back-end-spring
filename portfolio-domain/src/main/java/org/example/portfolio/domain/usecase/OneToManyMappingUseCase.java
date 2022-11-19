package org.example.portfolio.domain.usecase;

import org.springframework.stereotype.Component;

@Component
public interface OneToManyMappingUseCase<P, C, K> {

    P addElement(C childDto, K parentId);

    P removeElement(C childDto, K parentId);

}
