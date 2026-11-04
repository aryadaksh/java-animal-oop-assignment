
/**
 * This Driver class is created by
 * @author Ashutosh
 */

package com.animal;

public class Driver {

	public static void main(String[] args) {

		// Creating Animal object
		Animal animal = new Animal("Tom", 5);

		// Test accessing private variables through public getters
		System.out.println("Testing Public Getters");
		System.out.println("Animal Name: " + animal.getName());
		System.out.println("Animal Age: " + animal.getAge());

		// Test updating private variables through public setters
		animal.setName("Bruno");
		animal.setAge(7);

		System.out.println("\nAfter updating values:");
		System.out.println("Animal Name: " + animal.getName());
		System.out.println("Animal Age: " + animal.getAge());

		// Test negative age validation
		System.out.println("\nTesting Negative Age Validation");

		try {
			animal.setAge(-5);
		} catch (IllegalArgumentException e) {
			System.out.println("Validation Successful: " + e.getMessage());
		}

		// Test negative age through constructor
		System.out.println("\nTesting Constructor Age Validation");

		try {
			Animal invalidAnimal = new Animal("Rocky", -3);
		} catch (IllegalArgumentException e) {
			System.out.println("Validation Successful: " + e.getMessage());
		}

		// Test invalid name validation
		System.out.println("\nTesting Invalid Name Validation");

		try {
			animal.setName(" ");
		} catch (IllegalArgumentException e) {
			System.out.println("Validation Successful: " + e.getMessage());
		}

		// Verify original values remain unchanged
		System.out.println("\nFinal Animal Details:");
		System.out.println("Animal Name: " + animal.getName());
		System.out.println("Animal Age: " + animal.getAge());

		System.out.println("===============================");

		// Dog object testing
		Dog dog = new Dog("Tommy", 5);
		dog.getInfo();

		System.out.println("Dog Name: " + dog.getName());
		System.out.println("Dog Age: " + dog.getAge());

		System.out.println("=================================");
		System.out.println("Runtime Polymorphism Demonstration");
		System.out.println("Author : Daksh Arya");
		System.out.println("=================================");

		// Animal reference pointing to Dog object
		Animal dog1 = new Dog();

		// Animal reference pointing to Cat object
		Animal cat1 = new Cat();

		// Runtime polymorphism
		dog1.makeSound();
		System.out.println();

		cat1.makeSound();

		System.out.println();
		System.out.println("Runtime Polymorphism Verified");

	}
}
