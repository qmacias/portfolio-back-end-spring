package org.example.portfolio.infrastructure.mapper.factory;

import org.example.portfolio.infrastructure.mapper.*;

public abstract class ModelMapperFactory {

    private static ModelMapperFactory factory = null;

    public static ModelMapperFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public static void setFactory(ModelMapperFactory factory) {
        ModelMapperFactory.factory = factory;
    }

    public abstract PersonMapper getPersonMapperInstance();

    public abstract ImageMapper getImageMapperInstance();

    public abstract PhoneMapper getPhoneMapperInstance();

    public abstract AddressMapper getAddressMapperInstance();

    public abstract SocialMapper getSocialMapperInstance();

    public abstract JobMapper getJobMapperInstance();

    public abstract AchievementMapper getAchievementMapperInstance();

    public abstract DurationMapper getDurationMapperInstance();

}
