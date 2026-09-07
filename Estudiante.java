public class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public String obtenerCalificacion() {
        if (calcularPromedio() >= 60) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
