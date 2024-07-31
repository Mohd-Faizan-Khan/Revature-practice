package com.animals;

public class Wolf extends Canine{
	String name;
	int age;
	
	public static void main(String[] args) {
		Wolf wolf = new Wolf(2, "Carnivore" ,"Ghost", 10);
		System.out.println(wolf);
		wolf.eat();
		
	}
	
	
	public Wolf(int animalCount, String foodType, String name, int age) {
		super(animalCount, foodType);
		this.name = name;
		this.age = age;
	}


	public void makeNoise() {
		System.out.println("Wolf howls!!");
	}


	@Override
	public String toString() {
		return "Wolf [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
