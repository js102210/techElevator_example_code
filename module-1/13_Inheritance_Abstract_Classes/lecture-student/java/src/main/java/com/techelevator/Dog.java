package com.techelevator;

import com.techelevator.farm.FarmAnimal;

public class Dog extends FarmAnimal {

    public Dog() {
        super("Cat");
    }

    public String makeSound() {
        return "woof";
    }



}
