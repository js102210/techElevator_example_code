package com.techelevator.farm;

import java.math.BigDecimal;

public class LivingStatue extends FarmAnimal{
    public LivingStatue() {
        super("Living Statue");
    }

    public String makeSound () {
        return "whsssshh";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("7463673673764342356523765874658374253625.4");
    }
}
