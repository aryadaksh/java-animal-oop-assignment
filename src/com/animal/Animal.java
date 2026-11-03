package com.animal;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		validateName(name);
		validateAge(age);
	}
	
	public void makeSound() {
		System.out.println("Animal.makeSound()");
	}
	
	public void displayInfo() {
		System.out.println("Animal Name: " + name);
		System.out.println("Animal Age: " + age);
	}
	
	private void validateName(String name) {
		if(name.isEmpty() || name == null) throw new IllegalArgumentException("Enter a Valid name");
		this.name = name;
	}
	
	private void validateAge(int age) {
		if(age < 0) throw new IllegalArgumentException("Age must be greater then 0");
		this.age = age;
	}
	
	/**
	 * @author Aaditya Kumar
	 */
	
	public Animal() {
		super();
	}
	
	public Animal getInfo() {
		System.out.println("Parent class: Animal of Covariant return type demonstartion");
		Animal animal = new Animal();
		return animal;
	}

	
}
