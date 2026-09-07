import java.util.Scanner;

public class CalculadoraBasica {
    public static void calculadora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= CALCULADORA BASICA =======");
        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();
        
        System.out.println("Indique la operacion que desea realizar: (+, -, *, /)");
        char operacion = scanner.next().charAt(0);
        System.out.println("Ingrese el segundo numero");

        double num2 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer

        switch (operacion) {
            case '+':
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case '*':
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("El resultado es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operacion invalida");
        }
    }
}
