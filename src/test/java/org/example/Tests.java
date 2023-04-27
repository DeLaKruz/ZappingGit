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

        int clicsObtenidos = Main.cambioDeCanalOptimo(canaldeorigen, canaldedestino);

        assertEquals(clics, clicsObtenidos);
    }
}