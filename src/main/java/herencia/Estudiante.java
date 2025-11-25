package herencia;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Carrera: " + carrera);
    }
}
