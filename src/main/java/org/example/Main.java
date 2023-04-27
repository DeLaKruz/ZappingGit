package org.example;

public class Main {
        public static int cambioDeCanalOptimo(int canaldeorigen, int canaldedestino) {
            int difCanales = Math.abs(canaldedestino - canaldeorigen);
            int clicsDirectos = Math.min(difCanales, 99 - difCanales);
            int clicsIndirectos = 1 + Math.min(canaldeorigen, canaldedestino) + (99 - Math.max(canaldeorigen, canaldedestino));
            return Math.min(clicsDirectos, clicsIndirectos);
        }
    }