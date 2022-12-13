package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface GenericPersistencePort<Dto, Key> {

    Set<Dto> getAll();

    Dto getById(Key id);

    Dto createOrUpdate(Dto modelDto);

    void removeById(Key id);

}
