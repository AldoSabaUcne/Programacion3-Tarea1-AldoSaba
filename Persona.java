public class Persona {
    protected String nombre;
    protected int edad;
    protected String correo;

    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = "No asignado";
    }

    public String mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        return nombre;
    }
}
