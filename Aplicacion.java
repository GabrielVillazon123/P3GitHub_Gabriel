import java.util.Scanner;

public class Aplicacion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n¿Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "!");
        System.out.println("\nIntroduce tu edad");
        int edad = scanner.nextInt();
        System.out.println(nombre+ " tienes una edad de "+edad );
    }
}