package org.example.portfolio.configuration;

import org.example.portfolio.domain.port.in.ImageServicePort;
import org.example.portfolio.domain.port.in.PersonServicePort;

import org.example.portfolio.domain.port.out.ImagePersistencePort;
import org.example.portfolio.domain.port.out.PersonPersistencePort;

import org.example.portfolio.domain.service.ImageServiceImpl;
import org.example.portfolio.domain.service.PersonServiceImpl;

import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.infrastructure.repository.PersonRepository;

import org.example.portfolio.infrastructure.adapter.ImageJpaAdapter;
import org.example.portfolio.infrastructure.adapter.PersonJpaAdapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public PersonServicePort getPersonService(PersonPersistencePort personPersistencePort) {
        return new PersonServiceImpl(personPersistencePort);
    }

    @Bean
    public PersonPersistencePort getPersonPersistence(PersonRepository personRepository) {
        return new PersonJpaAdapter(personRepository);
    }

    @Bean
    public ImagePersistencePort getImagePersistence(ImageRepository imageRepository) {
        return new ImageJpaAdapter(imageRepository);
    }

    @Bean
    public ImageServicePort getImageService(ImagePersistencePort imagePersistencePort) {
        return new ImageServiceImpl(imagePersistencePort);
    }

}
