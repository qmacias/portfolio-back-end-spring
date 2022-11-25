package org.example.portfolio.configuration;

import org.example.portfolio.domain.port.input.PersonServicePort;
import org.example.portfolio.domain.port.output.ImagePersistencePort;
import org.example.portfolio.domain.port.output.PersonPersistencePort;
import org.example.portfolio.domain.port.output.PhonePersistencePort;
import org.example.portfolio.domain.service.PersonServiceImpl;
import org.example.portfolio.infrastructure.adapter.PhoneJpaAdapter;
import org.example.portfolio.infrastructure.mapper.ImageMapper;
import org.example.portfolio.infrastructure.mapper.PersonMapper;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;
import org.example.portfolio.infrastructure.mapper.impl.ImageMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.PersonMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.PhoneMapperImpl;
import org.example.portfolio.infrastructure.repository.ImageRepository;
import org.example.portfolio.infrastructure.repository.PersonRepository;
import org.example.portfolio.infrastructure.adapter.ImageJpaAdapter;
import org.example.portfolio.infrastructure.adapter.PersonJpaAdapter;
import org.example.portfolio.infrastructure.repository.PhoneRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfiguration {

    @Bean
    public ImageMapper getToImageMapper() {
        return new ImageMapperImpl();
    }

    @Bean
    public PhoneMapper getToPhoneMapper() {
        return new PhoneMapperImpl();
    }

    @Bean
    public PersonMapper getToPersonMapper(ImageMapper imageMapper, PhoneMapper phoneMapper) {
        return new PersonMapperImpl(imageMapper, phoneMapper);
    }

    @Bean
    public ImagePersistencePort getImagePersistence(ImageRepository imageRepository, ImageMapper imageMapper) {
        return new ImageJpaAdapter(imageRepository, imageMapper);
    }

    @Bean
    public PhonePersistencePort getPhonePersistence(PhoneRepository phoneRepository, PhoneMapper phoneMapper) {
        return new PhoneJpaAdapter(phoneRepository, phoneMapper);
    }

    @Bean
    public PersonPersistencePort getPersonPersistence(PersonRepository personRepository, PersonMapper personMapper) {
        return new PersonJpaAdapter(personRepository, personMapper);
    }

    @Bean
    public PersonServicePort getPersonService(PersonPersistencePort personPersistence) {
        return new PersonServiceImpl(personPersistence);
    }

}
