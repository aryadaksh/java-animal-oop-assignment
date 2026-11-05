package com.animal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Nitin Kumar
 */

class AnimalTest {

	@Test
	void testConstructor() {

		Animal animal = new Animal("Tommy", 5);

		assertEquals("Tommy", animal.getName());
		assertEquals(5, animal.getAge());
	}

	@Test
	void testSetName() {

		Animal animal = new Animal();

		animal.setName("Bruno");

		assertEquals("Bruno", animal.getName());
	}

	@Test
	void testSetAge() {

		Animal animal = new Animal();

		animal.setAge(3);

		assertEquals(3, animal.getAge());
	}

	@Test
	void testNegativeAge() {

		Animal animal = new Animal();

		assertThrows(IllegalArgumentException.class, () -> animal.setAge(-5));
	}

	@Test
	void testEmptyName() {

		Animal animal = new Animal();

		assertThrows(IllegalArgumentException.class, () -> animal.setName(""));
	}

	@Test
	void testNullName() {

		Animal animal = new Animal();

		assertThrows(IllegalArgumentException.class, () -> animal.setName(null));
	}

	@Test
	void testGetInfo() {

		Animal animal = new Animal();

		Animal result = animal.getInfo();

		assertNotNull(result);
	}

	@Test
	void testMakeSound() {

		Animal animal = new Animal();

		animal.makeSound();
	}
	
	@Test
	void testDisplayInfo() {

	    Animal animal = new Animal("Tommy", 5);

	    assertDoesNotThrow(() -> animal.displayInfo());
	}
}