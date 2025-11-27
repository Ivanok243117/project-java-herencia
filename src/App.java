

public class App {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Ivanok", 46, "Analisis diesño y desarrollo de software");
        Profesor p = new Profesor("Carlos", 45, "Java");

        e.mostrarInfo();
        p.mostrarInfo();
    }
}

