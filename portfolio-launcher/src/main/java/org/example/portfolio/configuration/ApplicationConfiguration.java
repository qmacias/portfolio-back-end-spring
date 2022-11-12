package org.example.portfolio.configuration;

import org.example.portfolio.adapter.ImageJpaAdapter;
import org.example.portfolio.port.in.ImageServicePort;
import org.example.portfolio.port.in.PersonServicePort;
import org.example.portfolio.port.out.ImagePersistencePort;
import org.example.portfolio.port.out.PersonPersistencePort;

import org.example.portfolio.repository.ImageRepository;
import org.example.portfolio.service.ImageService;
import org.example.portfolio.service.PersonService;

import org.example.portfolio.adapter.PersonJpaAdapter;

import org.example.portfolio.repository.PersonRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public PersonServicePort getPersonService(PersonPersistencePort personPersistencePort) {
        return new PersonService(personPersistencePort);
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
        return new ImageService(imagePersistencePort);
    }

}
