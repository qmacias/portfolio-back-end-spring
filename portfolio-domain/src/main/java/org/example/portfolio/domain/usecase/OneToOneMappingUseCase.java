package org.example.portfolio.domain.usecase;

public interface OneToOneMappingUseCase<P, C, K> {

    P assignDetails(C childDto, K parentId);

}
