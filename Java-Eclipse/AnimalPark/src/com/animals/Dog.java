package com.animals;

public class Dog extends Canine{
	String name;
	int age;
	String breed;
	
	public static void main(String[] args) {
		Dog dog = new Dog("Entertainment", 5, "Golden retriever");
		
		System.out.println(dog);
		dog.eat();
		
	}

	public Dog(String name, int age, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public void makeNoise() {
		System.out.println("Dog barks!!");
	}




	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}


	

	
	
}
