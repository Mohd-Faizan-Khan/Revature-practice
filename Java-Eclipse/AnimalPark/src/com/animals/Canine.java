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
	
	public Canine() {
		super();
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
	
	public void roam() {
		System.out.println("All Canine roam!!");
	}
	
	public void sleep() {
		System.out.println("All Canine sleep attentive!!");
	}
	
	public void eat() {
		System.out.println("Canine are Omnivores and tends to enjoy meat");
	}
	
}
