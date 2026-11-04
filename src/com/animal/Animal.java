package com.animal;

public class Animal 
{
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public void makeSound() {
		System.out.println("Animal.makeSound()");
	}
	
	public void displayInfo() {
		System.out.println("Animal Name: " + name);
		System.out.println("Animal Age: " + age);
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

	/**
	 * @author Ashutosh
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty.");
		}
		this.name = name.trim();
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative.");
		}
		this.age = age;
	}
}
