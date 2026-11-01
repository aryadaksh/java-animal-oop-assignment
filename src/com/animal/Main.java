package com.animal;

public class Main {
	public static void main(String[] args) {
		System.out.println("--- Testing Requirement 4: Access through public methods ---\n");

		// 1. Test Valid Data Creation and Getters
		try {
			System.out.println("Creating a valid Animal object...");
			Animal lion = new Animal("Simba", 5, "Lion", "Savannah", "Carnivore");

			// Testing Getters
			System.out.println("Successfully created!");
			System.out.println("Name: " + lion.getName());
			System.out.println("Age: " + lion.getAge());
			System.out.println("Species: " + lion.getSpecies());

			// Testing Setters with valid updates
			System.out.println("\nUpdating age using setter...");
			lion.setAge(6);
			System.out.println("New Age: " + lion.getAge());

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("\n--------------------------------------------------\n");

		// 2. Test Age Validation (Negative values)
		try {
			System.out.println("Attempting to set a negative age (-3)...");
			Animal invalidAnimal = new Animal("Leo", -3, "Leopard", "Forest", "Carnivore");
		} catch (IllegalArgumentException e) {
			System.out.println("Caught Expected Exception: " + e.getMessage());
		}

		// 3. Test Blank Field Validation
		try {
			System.out.println("\nAttempting to set an empty name...");
			Animal lion = new Animal("Simba", 5, "Lion", "Savannah", "Carnivore");
			lion.setName(""); // Triggers validation
		} catch (IllegalArgumentException e) {
			System.out.println("Caught Expected Exception: " + e.getMessage());
		}
	}
}
