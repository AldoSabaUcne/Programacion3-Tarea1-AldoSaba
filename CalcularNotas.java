import java.util.Scanner;

public class CalcularNotas {
    public static void calcularNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas notas deseas ingresar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Nota " + i + ":");
            suma += scanner.nextDouble();
        }
        System.out.println("Promedio: " + (suma / cantidad));
    }
}
