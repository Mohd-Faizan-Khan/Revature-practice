package com.animals;

public class Tiger extends Feline{
	String name;
	int age;
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.age = 10;
		tiger.name = "Jack";
//		Animal animal = (Animal)tiger;
		System.out.println(tiger);
		tiger.roam();
	}
	
	public Tiger() {
		super();
	}
	
	
	public Tiger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public void makeNoise() {
		System.out.println("Tigers growls!!");
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + ", age=" + age + "]";
	}
	
	

}
