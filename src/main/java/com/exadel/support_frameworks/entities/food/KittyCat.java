package com.exadel.support_frameworks.entities.food;

import lombok.*;

@ToString
@EqualsAndHashCode(doNotUseGetters = true)
@RequiredArgsConstructor
public class KittyCat {

    private @NonNull String name;

    @Getter
    @Setter
    @NonNull
    private Integer weight;

    @Getter
    @Setter
    @ToString.Exclude
    private String calorificValue;
}
