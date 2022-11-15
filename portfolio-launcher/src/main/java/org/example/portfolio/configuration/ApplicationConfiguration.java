package org.example.portfolio.configuration;

import org.example.portfolio.domain.port.in.ImageServicePort;
import org.example.portfolio.domain.port.in.PersonServicePort;

import org.example.portfolio.domain.port.out.ImagePersistencePort;
import org.example.portfolio.domain.port.out.PersonPersistencePort;

import org.example.portfolio.domain.service.ImageServiceImpl;
import org.example.portfolio.domain.service.PersonServiceImpl;

import org.example.portfolio.infrastructure.mapper.ToImageDtoOrEntityMapper;
import org.example.portfolio.infrastructure.mapper.ToPersonDtoMapper;
import org.example.portfolio.infrastructure.mapper.ToPersonEntityMapper;

import org.example.portfolio.infrastructure.mapper.impl.ToImageDtoOrEntityMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.ToPersonDtoMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.ToPersonEntityMapperImpl;

import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.infrastructure.repository.PersonRepository;

import org.example.portfolio.infrastructure.adapter.ImageJpaAdapter;
import org.example.portfolio.infrastructure.adapter.PersonJpaAdapter;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;

import org.modelmapper.ModelMapper;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ToImageDtoOrEntityMapper getToImageDtoMapper(ModelMapper modelMapper) {
        return new ToImageDtoOrEntityMapperImpl(modelMapper);
    }

    @Bean
    public ToPersonDtoMapper getToPersonDtoMapper(ModelMapper modelMapper) {
        return new ToPersonDtoMapperImpl(modelMapper);
    }

    @Bean
    public ToPersonEntityMapper getToPersonEntityMapper(ModelMapper modelMapper) {
        return new ToPersonEntityMapperImpl(modelMapper);
    }

    @Bean
    public ImagePersistencePort getImagePersistence(
            ImageRepository imageRepository,
            ToImageDtoOrEntityMapper toImageDtoOrEntityMapper
    ) {
        return new ImageJpaAdapter(imageRepository, toImageDtoOrEntityMapper);
    }

    @Bean
    public PersonPersistencePort getPersonPersistence(
            PersonRepository personRepository,
            ToPersonDtoMapper toPersonDtoMapper,
            ToPersonEntityMapper toPersonEntityMapper
    ) {
        return new PersonJpaAdapter(personRepository, toPersonDtoMapper, toPersonEntityMapper);
    }

    @Bean
    public ImageServicePort getImageService(ImagePersistencePort imagePersistence) {
        return new ImageServiceImpl(imagePersistence);
    }

    @Bean
    public PersonServicePort getPersonService(PersonPersistencePort personPersistence) {
        return new PersonServiceImpl(personPersistence);
    }

}
