package com.exadel.support_frameworks.entities.utils;

import com.exadel.support_frameworks.entities.enumerations.CuteLevel;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CuteLevelConverter implements Converter<CuteLevel> {

    @Override
    public CuteLevel convert(Method method, String s) {
        return Arrays.stream(CuteLevel.values()).filter(cuteLevel -> cuteLevel.toString().equals(s)).findFirst().get();
    }
}