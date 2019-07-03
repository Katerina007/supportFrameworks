package com.exadel.support_frameworks.entities.utils;

import com.exadel.support_frameworks.entities.enumerations.CuteLevel;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:properties/cuteLevel.properties")
public interface CuteLevelProperty extends Config {

    @Key(value = "hairless.property")
    @ConverterClass(CuteLevelConverter.class)
    CuteLevel getHairlessProperty();

    @Key(value = "bad.property")
    @ConverterClass(CuteLevelConverter.class)
    CuteLevel getBadProperty();

    @Key(value = "fat.property")
    @ConverterClass(CuteLevelConverter.class)
    CuteLevel getFatProperty();
}
