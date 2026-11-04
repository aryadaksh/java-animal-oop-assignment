
package com.animal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Nitin Kumar
 */

class CatTest {

    // 1. Test parameterized constructor
    @Test
    void testConstructor() {

        Cat cat = new Cat("Kitty", 3);

        assertEquals("Kitty", cat.getName());
        assertEquals(3, cat.getAge());
    }

    // 2. Test default constructor
    @Test
    void testDefaultConstructor() {

        Cat cat = new Cat();

        assertNotNull(cat);
    }

    // 3. Test makeSound()
    @Test
    void testMakeSound() {

        Cat cat = new Cat("Kitty", 3);

        assertDoesNotThrow(() -> cat.makeSound());
    }

    // 4. Test runtime polymorphism
    @Test
    void testRuntimePolymorphism() {

        Animal animal = new Cat("Kitty", 3);

        assertTrue(animal instanceof Cat);

        assertDoesNotThrow(() -> animal.makeSound());
    }

    // 5. Test negative age
    @Test
    void testNegativeAge() {

        assertThrows(IllegalArgumentException.class,
                () -> new Cat("Kitty", -5));
    }

    // 6. Test invalid name
    @Test
    void testInvalidName() {

        assertThrows(IllegalArgumentException.class,
                () -> new Cat("", 3));
    }
}
