package org.example.portfolio.domain.common;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface GenericPersistencePort<Dto, Key> {

    List<Dto> getAll();

    Dto getById(Key id);

    Dto createOrUpdate(Dto modelDto);

    void removeById(Key id);

}
