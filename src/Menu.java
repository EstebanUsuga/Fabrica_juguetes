package src;

import src.dominio.Juguete;
import src.strategy.AccionClonar;
import src.strategy.AccionCrear;
import src.strategy.AccionEliminarPorColor;
import src.strategy.AccionEliminarPorId;
import src.strategy.AccionMostrar;
import src.util.LectorTeclado;

import java.util.ArrayList;
import java.util.List;


/**
 * Patrones de diseño -> soluciones a problemas comunes de software
 * Singleton -> Sirve para crear clases con una única instancia. (save, delete, find)
 * Builder -> Ayuda a crear objetos de una forma más flexible. Juguete.builder().id(x).name(x).relleno(x).materialExt(x).build();
 * Strategy -> Normalmente se utiliza para casos donde hayan diferentes caminos (Switch).
 * Prototype
 * Factory Method
 */

/**
 * Modificadores de acceso
 * Public: Se puede utilizar en toda la aplicación.
 * Private: A nivel de clase.
 * Protected: A nivel de subclase y paquete.
 * Default (sin modificador): A nivel paquete. XXXXX (Nunca!)
 */

public class Menu {

    public static void imprimir() {
        List<Juguete> listadoJuguetes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Crear Juguete");
            System.out.println("2. Clonar Juguete");
            System.out.println("3. Eliminar Juguete");
            System.out.println("4. Mostrar Juguetes Registrados");
            System.out.println("5. Eliminar juguetes por color");
            System.out.println("0. Salir");
            opcion = LectorTeclado.leerInt("Ingrese su opción: ");

            switch (opcion) {
                case 1 -> AccionCrear.getInstance().ejecutar(listadoJuguetes);
                case 2 -> AccionClonar.getInstance().ejecutar(listadoJuguetes);
                case 3 -> AccionEliminarPorId.getInstance().ejecutar(listadoJuguetes);
                case 4 -> AccionMostrar.getInstance().ejecutar(listadoJuguetes);
                case 5 -> AccionEliminarPorColor.getInstance().ejecutar(listadoJuguetes);
                case 0 -> System.out.println("Salir del programa ¡Hasta pronto!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

    }
}
