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
        int entero = 0;
        boolean debeContinuar = true;

        do {
            try {
                entero = scanner.nextInt();
                debeContinuar = false;
            } catch (Exception exception) {
                System.out.println("Debe ingresar un número entero");
            }
            scanner.nextLine();
        } while(debeContinuar);

        return entero;
    }
}
