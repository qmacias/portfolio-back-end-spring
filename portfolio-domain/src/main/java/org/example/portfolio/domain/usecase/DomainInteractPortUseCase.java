package org.example.portfolio.domain.usecase;

import java.util.List;

public interface DomainInteractPortUseCase<T, K> {

    List<T> getAll();

    T getById(K id);

    T createOrUpdate(T modelDto);

    void removeById(K id);

}
