package com.techelevator.farm;

import java.math.BigDecimal;

public class OldMacdonald {
	public static void main(String[] args) {


		Cow daisy = new Cow();
		Chicken nugget = new Chicken();
		LivingStatue rocky = new LivingStatue();
		Singable[] singables = new Singable[] { daisy, nugget, rocky, new Tractor()};
		BigDecimal total = BigDecimal.ZERO;
		for (Singable animal : singables) {
			String name = animal.getName();
			String sound = animal.makeSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had " + animal.getArticle() + " " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);

		}

		Sellable[] inventory = new Sellable[] { daisy, nugget, rocky, new Egg()};


		for (Sellable item : inventory) {
			System.out.println("You can buy that " + item.getName() + " for " + item.getPrice());
			total = total.add(item.getPrice());

		}
		System.out.println("or you can buy that farm for " + total.multiply(BigDecimal.valueOf(0.9)));

		Singable eric = new Chicken();
		eric.makeSound();
		((Chicken)eric).layEgg();

		if (eric instanceof Chicken) {
			System.out.println("Eric is a chicken");
			((Chicken)eric).layEgg();
		}

	}
}