package com.techelevator.farm;


public abstract class FarmAnimal implements Singable{
	private final String name;
	private String nickName;

	public FarmAnimal(String name) {
		this.name = name;
	}

	public final String getName() {
		if (nickName != null){
			return name + " called " + nickName;
		}
		return name;

	}

	public abstract String makeSound();

	public String getArticle() {
		return "a";
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return this.nickName;
	}

	@Override
	public String toString() {
		return this.getArticle() + " " + this.name;
	}
}