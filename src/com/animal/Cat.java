package com.animal;

public class Cat extends Animal {

	// cat class constructor
	public Cat(String name, int age) {
		
		// Call the parent class constructor
				// to initialize name and age.
		super(name, age);
	}
	// @author Masood 
	 @Override
	    public void makeSound() {
	        System.out.println("Cat makes a sound Meow");
	    }

}
