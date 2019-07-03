package com.exadel.support_frameworks.entities.enumerations;

import org.apache.commons.lang3.StringUtils;

public enum CuteLevel {
    BAD_CAT,
    FAT_CAT,
    HAIRLESS_CAT;

    @Override
    public String toString() {
        return StringUtils.replaceChars(super.toString(), '_', ' ')
                .toLowerCase()
                .replaceFirst(".", StringUtils.left(super.toString(), 1));
    }
}
