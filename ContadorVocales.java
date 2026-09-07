import java.util.Scanner;

public class ContadorVocales {
    public static void contarVocales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine().toLowerCase();
        int contador = 0;
        
        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        System.out.println("Número de vocales: " + contador);
        scanner.nextLine(); // Limpiar buffer
    }
}
    
