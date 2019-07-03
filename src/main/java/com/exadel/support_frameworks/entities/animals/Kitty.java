package com.exadel.support_frameworks.entities.animals;

import com.exadel.support_frameworks.entities.enumerations.CuteLevel;
import com.exadel.support_frameworks.entities.food.EatCharacteristic;
import com.exadel.support_frameworks.entities.food.KittyCat;
import com.exadel.support_frameworks.entities.humans.Owner;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, of = "dailyFood")
public class Kitty extends Animal {
    private CuteLevel cuteLevel;
    private Owner owner;
    private KittyCat dailyFood;

    public Kitty(String name, Integer weight) {
        super(name, weight);
        log.info("Котэ был рожден");
    }

    public void eat(EatCharacteristic eatCharacteristic) {
        if (this.dailyFood.getWeight() == 0) {
            log.warn("Кот обеспокоен нехваткой пищи");
            return;
        }
        else {
            log.info("Кот поел");
            this.dailyFood.setWeight(this.dailyFood.getWeight() - eatCharacteristic.getAmountFoodEaten());
            if (this.dailyFood.getWeight() < 0) {
                this.dailyFood.setWeight(0);
            }
        }
    }

    @SneakyThrows
    public void kill() {
        log.error("Кот умер");
        if (!cuteLevel.toString().equals(CuteLevel.BAD_CAT.toString())) {
            log.info(StringUtils.joinWith(" ", "Хозяин", owner.getName(), owner.getLastName(), "в печали"));
        }
        throw new InterruptedException();
    }
}

