package com.animal;

// Dog is a child class of Animal.
// It inherits the common properties and methods from Animal.

public class Dog extends Animal {
	
	// Constructor of Dog
	public Dog(String name, int age) {

		// Call the parent class constructor
		// to initialize name and age.
		super(name, age);
	}
	
	// @author Masood

	@Override
	public void makeSound() {
		System.out.println("Dog makes a sound... bhaw bhaw");
	}
	

}