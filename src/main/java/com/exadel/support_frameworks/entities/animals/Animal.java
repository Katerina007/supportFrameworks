package com.exadel.support_frameworks.entities.animals;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = "weight")
public abstract class Animal {
    private String name;

    @Setter
    private Integer weight;
}
