package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {
    @Test
    public void testCambioDeCanalDe0a0() {
        // Arrange
        int canaldeorigen = 0;
        int canaldedestino = 0;
        int clics = 0;

        // Act
        int clicsObtenidos = Main.cambioDeCanalOptimo(canaldeorigen, canaldedestino);

        // Assert
        assertEquals(clics, clicsObtenidos);
    }
    @Test
    public void testCambioDeCanalDe1a2() {
        // Arrange
        int canaldeorigen = 1;
        int canaldedestino = 2;
        int clics = 1;

        // Act
        int clicsObtenidos = Main.cambioDeCanalOptimo(canaldeorigen, canaldedestino);

        // Assert
        assertEquals(clics, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe10a30() {
        // Arrange
        int canaldeorigen = 10;
        int canaldedestino = 30;
        int clics = 20;

        // Act
        int clicsObtenidos = Main.cambioDeCanalOptimo(canaldeorigen, canaldedestino);

        // Assert
        assertEquals(clics, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe2a99() {
        // Arrange
        int canaldeorigen = 2;
        int canaldedestino = 99;
        int clics = 2;

        // Act
        int clicsObtenidos = Main.cambioDeCanalOptimo(canaldeorigen, canaldedestino);

        // Assert
        assertEquals(clics, clicsObtenidos);
    }

    @Test
    public void testCambioDeCanalDe5a63() {
        // Arrange
        int canaldeorigen = 5;
        int canaldedestino = 63;
        int clics = 41;

        // Act
        int clicsObtenidos = Main.cambioDeCanalOptimo(canaldeorigen, canaldedestino);

        // Assert
        assertEquals(clics, clicsObtenidos);
    }
}