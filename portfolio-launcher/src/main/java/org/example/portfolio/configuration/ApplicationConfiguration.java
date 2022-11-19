package org.example.portfolio.configuration;

import org.example.portfolio.domain.port.input.ImageServicePort;
import org.example.portfolio.domain.port.input.PersonServicePort;

import org.example.portfolio.domain.port.input.PhoneServicePort;
import org.example.portfolio.domain.port.output.ImagePersistencePort;
import org.example.portfolio.domain.port.output.PersonPersistencePort;

import org.example.portfolio.domain.port.output.PhonePersistencePort;
import org.example.portfolio.domain.service.ImageServiceImpl;
import org.example.portfolio.domain.service.PersonServiceImpl;

import org.example.portfolio.domain.service.PhoneServiceImpl;
import org.example.portfolio.infrastructure.adapter.PhoneJpaAdapter;
import org.example.portfolio.infrastructure.mapper.ToImageDtoOrEntityMapper;
import org.example.portfolio.infrastructure.mapper.ToPersonDtoMapper;
import org.example.portfolio.infrastructure.mapper.ToPersonEntityMapper;

import org.example.portfolio.infrastructure.mapper.ToPhoneDtoOrEntityMapper;
import org.example.portfolio.infrastructure.mapper.impl.ToImageDtoOrEntityMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.ToPersonDtoMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.ToPersonEntityMapperImpl;

import org.example.portfolio.infrastructure.mapper.impl.ToPhoneDtoOrEntityMapperImpl;
import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.infrastructure.repository.PersonRepository;

import org.example.portfolio.infrastructure.adapter.ImageJpaAdapter;
import org.example.portfolio.infrastructure.adapter.PersonJpaAdapter;

import org.example.portfolio.infrastructure.repository.PhoneRepository;
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
    public ToImageDtoOrEntityMapper getToImageDtoOrEntityMapper(ModelMapper modelMapper) {
        return new ToImageDtoOrEntityMapperImpl(modelMapper);
    }

    @Bean
    public ToPhoneDtoOrEntityMapper getToPhoneDtoOrEntityMapper(ModelMapper modelMapper) {
        return new ToPhoneDtoOrEntityMapperImpl(modelMapper);
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
    public PhonePersistencePort getPhonePersistence(
            PhoneRepository phoneRepository,
            ToPhoneDtoOrEntityMapper toPhoneDtoOrEntityMapper
    ) {
        return new PhoneJpaAdapter(phoneRepository, toPhoneDtoOrEntityMapper);
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
    public PhoneServicePort getPhoneService(PhonePersistencePort phonePersistence) {
        return new PhoneServiceImpl(phonePersistence);
    }

    @Bean
    public PersonServicePort getPersonService(PersonPersistencePort personPersistence) {
        return new PersonServiceImpl(personPersistence);
    }

}
