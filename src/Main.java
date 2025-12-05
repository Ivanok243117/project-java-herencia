//package com.ivanok.vehiculos;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== PRUEBA COMPONENTE BASE ====");
        ComponenteVehicular base = new ComponenteVehicular("B000", "Genérico");
        base.mostrarInformacion();
        
        System.out.println("==== MOTOR ====");
        Motor motor = new Motor("M001", "Bosch", 4, 120);
        motor.mostrarInformacion();
        motor.encenderMotor();

        System.out.println("\n==== TRANSMISIÓN ====");
        Transmision transmision = new Transmision("T001", "ZF", "Automática", 6);
        transmision.mostrarInformacion();
        transmision.cambiarMarcha(3);

        System.out.println("\n==== NEUMÁTICO ====");
        Neumatico neumatico = new Neumatico("N001", "Michelin", 17, 32.5);
        neumatico.mostrarInformacion();
        neumatico.verificarPresion();

        System.out.println("\n==== CHASIS ====");
        Chasis chasis = new Chasis("C001", "Toyota", "Monocasco", 250.0);
        chasis.mostrarInformacion();
        chasis.calcularCargaMaxima();

        System.out.println("\n==== SISTEMA DE FRENOS ====");
        SistemaFrenos frenos = new SistemaFrenos("F001", "Brembo", true, "Discos ventilados");
        frenos.mostrarInformacion();
        frenos.verificarABS();
    }
}