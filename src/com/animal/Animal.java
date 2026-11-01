package com.animal;

public class Animal {

	// Requirement 1: Make Animal fields private
	private String name;
	private int age;
	private String species; // The species or type of animal.
	private String habitat; // The natural environment or habitat where the animal lives
							// (e.g., forest, water, desert).
	private String diet; // What the animal eats

	// Constructor uses setters to ensure initial values are also validated
	public Animal(String name, int age, String species, String habitat, String diet) {
		setName(name);
		setAge(age);
		setSpecies(species);
		setHabitat(habitat);
		setDiet(diet);
	}

	// Requirement 2 & 3: Add getters/setters and validate age against negative
	// values
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		if (species == null || species.trim().isEmpty()) {
			throw new IllegalArgumentException("Species cannot be null or empty.");
		}
		this.species = species.trim();
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		if (habitat == null || habitat.trim().isEmpty()) {
			throw new IllegalArgumentException("Habitat cannot be null or empty.");
		}
		this.habitat = habitat.trim();
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		if (diet == null || diet.trim().isEmpty()) {
			throw new IllegalArgumentException("Diet cannot be null or empty.");
		}
		this.diet = diet.trim();
	}
}
