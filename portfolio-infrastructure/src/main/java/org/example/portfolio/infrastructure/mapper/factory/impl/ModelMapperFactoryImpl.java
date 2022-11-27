package org.example.portfolio.infrastructure.mapper.factory.impl;

import org.example.portfolio.infrastructure.mapper.PersonMapper;
import org.example.portfolio.infrastructure.mapper.ImageMapper;
import org.example.portfolio.infrastructure.mapper.PhoneMapper;
import org.example.portfolio.infrastructure.mapper.AddressMapper;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;
import org.example.portfolio.infrastructure.mapper.impl.PersonMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.ImageMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.PhoneMapperImpl;
import org.example.portfolio.infrastructure.mapper.impl.AddressMapperImpl;

public class ModelMapperFactoryImpl extends ModelMapperFactory {

    private PersonMapper personMapper = null;

    private ImageMapper imageMapper = null;

    private PhoneMapper phoneMapper = null;

    private AddressMapper addressMapper = null;

    @Override
    public PersonMapper getPersonMapperInstance() {

        if (personMapper == null) {
            personMapper = new PersonMapperImpl();
        }

        return personMapper;
    }

    @Override
    public ImageMapper getImageMapperInstance() {

        if (imageMapper == null) {
            imageMapper = new ImageMapperImpl();
        }

        return imageMapper;
    }

    @Override
    public PhoneMapper getPhoneMapperInstance() {

        if (phoneMapper == null) {
            phoneMapper = new PhoneMapperImpl();
        }

        return phoneMapper;
    }

    @Override
    public AddressMapper getAddressMapperInstance() {

        if (addressMapper == null) {
            addressMapper = new AddressMapperImpl();
        }

        return addressMapper;
    }

}
