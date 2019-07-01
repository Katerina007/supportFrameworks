package com.exadel.support_frameworks.entities.utils;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:properties/calorificValue.properties")
public interface CalorificValueProperty extends Config {

    @Key(value = "highValue")
    Integer getHighProperty();

    @Key(value = "mediumValue")
    Integer getMediumProperty();

    @Key(value = "lowValue")
    Integer getLowProperty();
}
