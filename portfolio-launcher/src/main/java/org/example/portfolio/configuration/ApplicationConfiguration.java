package org.example.portfolio.configuration;

import org.example.portfolio.domain.service.PersonServiceImpl;
import org.example.portfolio.domain.port.input.PersonServicePort;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import org.example.portfolio.infrastructure.adapter.PersonJpaAdapter;
import org.example.portfolio.infrastructure.repository.PersonRepository;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;
import org.example.portfolio.infrastructure.mapper.factory.impl.ModelMapperFactoryImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ApplicationConfiguration {

    @PostConstruct
    public void init() {
        ModelMapperFactory.setFactory(new ModelMapperFactoryImpl());
    }

    @Bean
    public PersonPersistencePort getPersonPersistence(PersonRepository personRepository) {
        return new PersonJpaAdapter(personRepository);
    }

    @Bean
    public PersonServicePort getPersonService(PersonPersistencePort personPersistence) {
        return new PersonServiceImpl(personPersistence);
    }

}