package org.example;

public class Main {
        public static int cambioDeCanalOptimo(int canaldeorigen, int canaldedestino) {
            int distancia = Math.abs(canaldedestino - canaldeorigen);
            if (distancia > 49) {
                distancia = 99 - distancia;
            }
            return distancia;
        }
    }