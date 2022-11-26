package org.example.portfolio.domain.port;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GenericPersistencePort<T, K> {

    List<T> getAll();

    T getById(K id);

    T createOrUpdate(T modelDto);

    void removeById(K id);

}
