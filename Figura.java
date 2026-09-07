public abstract class Figura {
    public abstract double calcularArea();
    public abstract String getNombre();

    public void mostrarInformacion() {
        System.out.println("Figura: " + getNombre());
        System.out.println("Área: " + calcularArea());
    }
}
