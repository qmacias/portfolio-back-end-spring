package org.example.portfolio.domain.common;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GenericPersistencePort<Dto, Key> {

    List<Dto> getAll();

    Dto getById(Key id);

    Dto createOrUpdate(Dto modelDto);

    void removeById(Key id);

}
