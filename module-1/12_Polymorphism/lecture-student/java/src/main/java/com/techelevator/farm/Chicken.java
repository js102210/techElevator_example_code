package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken");
	}

	@Override
	public String makeSound() {
		return "Cluck";
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("12.00");
	}
}