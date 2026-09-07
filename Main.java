import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n================================");
            System.out.println("     MENU DE OPCIONES");
            System.out.println("====================================");
            System.out.println("  1. Calculadora básica           ");
            System.out.println("  2. Par o impar                  ");
            System.out.println("  3. Tabla de multiplicar         ");
            System.out.println("  4. Números del 1 al 100         ");
            System.out.println("  5. Clase Persona                ");
            System.out.println("  6. Clase Rectángulo ");
            System.out.println("  7. Clase Empleado   ");
            System.out.println("  8. Clase Figura   ");
            System.out.println("  9. Contador de vocales");
            System.out.println(" 10. Calculadora de notas");
            System.out.println("  0. Salir ");
            System.out.println("");
            System.out.print("Selecciona una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1:
                        CalculadoraBasica.calculadora();
                        break;
                    case 2:
                        ParImpar.parImpar();
                        break;
                    case 3:
                        TablaMultiplicar.tablaMultiplicar();
                        break;
                    case 4:
                        NumerosDel1Al100.numerosDel1Al100();
                        break;
                    case 5:
                        Persona persona = new Persona("Juan", 25);
                        persona.mostrarInfo();
                        break;
                    case 6:
                        Rectangulo rectangulo = new Rectangulo(5, 10);
                        rectangulo.mostrarInformacion();
                        break;
                    case 7:
                        Empleado empleado = new Empleado("Maria", 30, "Gerente", 1500.0);
                        empleado.mostrarDatos();
                        break;
                    case 8:
                        Figura figura = new Circulo(5);
                        figura.mostrarInformacion();
                        break;
                    case 9:
                        ContadorVocales.contarVocales();
                        break;
                    case 10:
                        CalcularNotas.calcularNotas();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            } else {
                System.out.println("Por favor, ingresa un numero valido.");
                scanner.nextLine();
                }
            }
        }
    }
