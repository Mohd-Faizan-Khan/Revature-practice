package com.animals;

public class Cat extends Feline{
	public String name;
	public int age;
	public void makeNoise() {
		System.out.println("Cats meows!!");
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Cat() {
		super();
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("Snow Bell", 4);
		cat.roam();
		System.out.println(cat);

	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
