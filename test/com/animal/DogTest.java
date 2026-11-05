
package com.animal;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * @author Nitin Kumar
 */


class DogTest {

    // 1. Test Dog constructor
    @Test
    void testDogConstructor() {

        Dog dog = new Dog("Tommy", 5);

        assertEquals("Tommy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    // 2. Test Dog method overriding
    @Test
    void testMakeSound() {

        Dog dog = new Dog("Tommy", 5);

        ByteArrayOutputStream output =
                new ByteArrayOutputStream();

        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));

            dog.makeSound();

        } finally {
            System.setOut(original);
        }

        assertEquals(
                "Dog makes a sound... bhaw bhaw",
                output.toString().trim()
        );
    }

    // 3. Test covariant return type
    @Test
    void testGetInfo() {

        Dog dog = new Dog();

        Dog result = dog.getInfo();

        assertNotNull(result);
        assertEquals(Dog.class, result.getClass());
    }

    // 4. Test runtime polymorphism
    @Test
    void testRuntimePolymorphism() {

        Animal animal = new Dog("Bruno", 3);

        assertTrue(animal instanceof Dog);
        assertEquals("Bruno", animal.getName());
    }

    // 5. Test negative age validation
    @Test
    void testNegativeAge() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Dog("Tommy", -5)
        );
    }

    // 6. Test invalid name validation
    @Test
    void testInvalidName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Dog("", 3)
        );
    }
}
