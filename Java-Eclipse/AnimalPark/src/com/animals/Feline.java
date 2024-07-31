package com.animals;

public abstract class Feline implements Animal{
	private final String type = "Cat Family";
	private int animalCount;
	private String foodType;
	
	
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
	
	
	
}
