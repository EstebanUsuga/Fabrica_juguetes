package src.util;

import java.util.Scanner;

public class LectorTeclado {

    private static final Scanner scanner = new Scanner(System.in); // final porque siempre va mantener el mismo objeto

    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static int leerInt(String mensaje) {
        System.out.println(mensaje);
        int entero = scanner.nextInt();
        scanner.nextLine();
        return entero;
    }
}
