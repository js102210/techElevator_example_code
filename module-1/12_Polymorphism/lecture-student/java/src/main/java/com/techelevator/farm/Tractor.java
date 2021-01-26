package com.techelevator.farm;

public class Tractor implements Singable{


    @Override
    public String getName() {
        return "hulking machine";
    }

    @Override
    public String makeSound() {
        return "scream of steel";
    }

    @Override
    public String getArticle() {
        return "a";
    }
}
