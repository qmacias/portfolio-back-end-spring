package org.example.portfolio.infrastructure.mapper.factory.impl;

import org.example.portfolio.infrastructure.mapper.*;
import org.example.portfolio.infrastructure.mapper.impl.*;
import org.example.portfolio.infrastructure.mapper.factory.ModelMapperFactory;

public class JpaModelMapperFactoryImpl extends ModelMapperFactory {

    private PersonMapper personMapper = null;

    private ImageMapper imageMapper = null;

    private PhoneMapper phoneMapper = null;

    private AddressMapper addressMapper = null;

    private SocialMapper socialMapper = null;

    private JobMapper jobMapper = null;

    private AchievementMapper achievementMapper = null;

    private DurationMapper durationMapper = null;

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

    @Override
    public JobMapper getJobMapperInstance() {
        if (jobMapper == null) {
            jobMapper = new JobMapperImpl();
        }
        return jobMapper;
    }

    @Override
    public AchievementMapper getAchievementMapperInstance() {
        if (achievementMapper == null) {
            achievementMapper = new AchievementMapperImpl();
        }
        return achievementMapper;
    }

    @Override
    public DurationMapper getDurationMapperInstance() {
        if (durationMapper == null) {
            durationMapper = new DurationMapperImpl();
        }
        return durationMapper;
    }

}
