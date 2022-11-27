package org.example.portfolio.domain.common;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface GenericPersistencePort<T, K> {

    List<T> getAll();

    T getById(K id);

    T createOrUpdate(T modelDto);

    void removeById(K id);

}
