package com.exadel.support_frameworks.entities.utils;

import org.aeonbits.owner.ConfigFactory;

public class PropertyHolder {
    public static CalorificValueProperty calorificValueProperty = ConfigFactory.create(CalorificValueProperty.class);
    public static CuteLevelProperty cuteLevelProperty = ConfigFactory.create(CuteLevelProperty.class);
}
