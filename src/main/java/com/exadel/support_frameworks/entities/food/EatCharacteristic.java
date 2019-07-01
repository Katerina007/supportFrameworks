package com.exadel.support_frameworks.entities.food;

import com.exadel.support_frameworks.entities.enumerations.CatPosition;
import com.exadel.support_frameworks.entities.enumerations.DayPart;
import lombok.Builder;
import lombok.Getter;

@Builder(builderMethodName = "createCharacteristic", builderClassName = "FoodCollector")
@Getter
public class EatCharacteristic {
    private int amountFoodEaten;
    private DayPart dayPart;
    private CatPosition catPosition;
}
