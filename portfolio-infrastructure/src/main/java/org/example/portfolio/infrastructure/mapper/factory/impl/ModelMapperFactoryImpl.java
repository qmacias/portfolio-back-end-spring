package org.example.portfolio.infrastructure.mapper.factory.impl;

import org.example.portfolio.infrastructure.mapper.*;
import org.example.portfolio.infrastructure.mapper.impl.*;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public class ModelMapperFactoryImpl extends ModelMapperFactory {

    private PersonMapper personMapper = null;

    private ImageMapper imageMapper = null;

    private PhoneMapper phoneMapper = null;

    private AddressMapper addressMapper = null;

    private SocialMapper socialMapper = null;

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

    @Override
    public SocialMapper getSocialMapperInstance() {
        if (socialMapper == null) {
            socialMapper = new SocialMapperImpl();
        }
        return socialMapper;
    }

}
