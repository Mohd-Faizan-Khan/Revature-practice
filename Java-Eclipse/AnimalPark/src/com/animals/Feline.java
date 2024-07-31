package com.animals;

public abstract class Feline implements Animal{
	private final String type = "Cat Family";
	private int animalCount;
	private String foodType;
	
	public Feline() {
		super();
	}
	
	public Feline(int animalCount, String foodType) {
		super();
		this.animalCount = animalCount;
		this.foodType = foodType;
	}


	public int getAnimalCount() {
		return animalCount;
	}


	public void setAnimalCount(int animalCount) {
		this.animalCount = animalCount;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Feline [type=" + type + ", animalCount=" + animalCount + ", foodType=" + foodType + "]";
	}
	
	public void sleep() {
		System.out.println("All Feline sleep lazy!!");
	}
	
	public void eat() {
		System.out.println("Felines are Omnivores and tends to enjoy meat");
	}
	
	
	public void roam() {
		System.out.println("All Felines roam!!");
	}

	
	
	
	
}
