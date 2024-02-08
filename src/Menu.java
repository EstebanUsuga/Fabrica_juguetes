package src;

import src.factory.CreadorCarrito;
import src.factory.CreadorPeluche;
import src.strategy.AccionClonar;
import src.strategy.AccionEliminarPorId;
import src.strategy.AccionMostrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void imprimir() {
        Scanner teclado = new Scanner(System.in);
        List<Juguete> listadoJuguetes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Crear Peluche");
            System.out.println("2. Crear Carrito");
            System.out.println("3. Clonar Juguete");
            System.out.println("4. Eliminar Juguete");
            System.out.println("5. Mostrar Juguetes Registrados");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> listadoJuguetes.add(new CreadorPeluche().crear());
                case 2 -> listadoJuguetes.add(new CreadorCarrito().crear());
                case 3 -> new AccionClonar().ejecutar(listadoJuguetes);
                case 4 -> new AccionEliminarPorId().ejecutar(listadoJuguetes);
                case 5 -> new AccionMostrar().ejecutar(listadoJuguetes);
                case 0 -> System.out.println("Salir del programa ¡Hasta pronto!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
