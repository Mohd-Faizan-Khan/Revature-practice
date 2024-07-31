package com.animals;

public abstract class Canine implements Animal{
	private final String type = "Dog Family";
	private int animalCount;
	private String foodType;
	
	public Canine(int animalCount, String foodType) {
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
	
	
	
}
