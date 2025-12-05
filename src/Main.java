//package com.ivanok.vehiculos;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== MOTOR ====");
        Motor motor = new Motor("M001", "Bosch", 4, 120);
        motor.mostrarInformacion();
        motor.encenderMotor();
    }
}