package com.animal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @author Nitin Kumar 
 */
class DriverTest {

    @Test
    void testDriverMain() {

        assertDoesNotThrow(() -> {
            Driver.main(new String[]{});
        });
    }

    @Test
    void testRuntimePolymorphism() {

        Animal dog = new Dog();
        Animal cat = new Cat();

        assertDoesNotThrow(() -> {
            dog.makeSound();
            cat.makeSound();
        });
    }

    @Test
    void testInvalidAge() {

        Animal animal = new Animal("Tom", 5);

        assertThrows(IllegalArgumentException.class,
                () -> animal.setAge(-5));
    }

    @Test
    void testInvalidName() {

        Animal animal = new Animal("Tom", 5);

        assertThrows(IllegalArgumentException.class,
                () -> animal.setName(" "));
    }

    @Test
    void testInvalidConstructorAge() {

        assertThrows(IllegalArgumentException.class,
                () -> new Animal("Rocky", -3));
    }
}