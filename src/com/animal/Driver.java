/**
 * This Driver class is created by 
 * @author Aaditya Kumar
 */

package com.animal;

public class Driver {

	public static void main(String[] args) {
		
		Animal animal = new Animal("myAnimalName", 10);
		animal.getInfo();
		
		System.out.println("Animal Name: " + animal.name);
		System.out.println("Animal Age: " + animal.age);

		System.out.println("===============================");
		
		Dog dog = new Dog("Tommy", 5);
		dog.getInfo();
		
		System.out.println("Dog Name: " + dog.name);
		System.out.println("Dog Age: " + dog.age);
	}

}
