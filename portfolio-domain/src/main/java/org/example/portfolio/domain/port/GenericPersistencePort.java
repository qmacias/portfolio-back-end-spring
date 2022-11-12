package org.example.portfolio.domain.port;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenericPersistencePort<T, K> {

    List<T> findAll();

    T findById(K id);

    T save(T entity);

    void deleteById(K id);

}
