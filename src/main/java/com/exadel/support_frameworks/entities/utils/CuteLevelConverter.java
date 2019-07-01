package com.exadel.support_frameworks.entities.utils;

import java.lang.reflect.Method;
import java.util.Arrays;

import com.exadel.support_frameworks.entities.enumerations.CuteLevel;
import org.aeonbits.owner.Converter;

public class CuteLevelConverter implements Converter<CuteLevel> {

    @Override
    public CuteLevel convert(Method method, String s) {
        return Arrays.stream(CuteLevel.values()).filter(cuteLevel -> cuteLevel.toString().equals(s)).findFirst().get();
    }
}