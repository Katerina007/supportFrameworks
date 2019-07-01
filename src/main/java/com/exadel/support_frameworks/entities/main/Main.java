package com.exadel.support_frameworks.entities.main;

import com.exadel.support_frameworks.entities.animals.Kitty;
import com.exadel.support_frameworks.entities.enumerations.CatPosition;
import com.exadel.support_frameworks.entities.enumerations.DayPart;
import com.exadel.support_frameworks.entities.food.EatCharacteristic;
import com.exadel.support_frameworks.entities.food.KittyCat;
import com.exadel.support_frameworks.entities.humans.Owner;
import com.exadel.support_frameworks.entities.utils.PropertyHolder;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        Owner luke = new Owner();
        luke.setName("Luke");
        luke.setLastName("Skywalker");
        luke.setAge(19);

        KittyCat food = new KittyCat("KittiCat", 6);

        @Cleanup("kill") Kitty kitty = new Kitty("CatCat", 1);
        kitty.setCuteLevel(PropertyHolder.cuteLevelProperty.getBadProperty());
        kitty.setOwner(luke);
        kitty.setDailyFood(food);

        @Cleanup("kill") Kitty catMother = new Kitty("CatCat", 2);
        catMother.setCuteLevel(PropertyHolder.cuteLevelProperty.getFatProperty());
        catMother.setOwner(luke);
        catMother.setDailyFood(food);

        @Cleanup("kill") Kitty catFather = new Kitty("CatCat", 3);
        catFather.setCuteLevel(PropertyHolder.cuteLevelProperty.getHairlessProperty());
        catFather.setOwner(luke);
        catFather.setDailyFood(food);

        EatCharacteristic meal = EatCharacteristic.createCharacteristic()
                         .amountFoodEaten(3)
                         .catPosition(CatPosition.STAND)
                         .dayPart(DayPart.MORNING)
                         .build();

        kitty.eat(meal);
        catMother.eat(meal);
        catFather.eat(meal);
    }
}
