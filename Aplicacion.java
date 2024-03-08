import java.util.Scanner;

public class Aplicacion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nCual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "!");
    }
}