package src;

import src.dominio.Juguete;
import src.strategy.Accion;
import src.strategy.AccionHandler;
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

    private static final AccionHandler accionHandler = AccionHandler.getInstance();
    private static final List<Juguete> listadoJuguetes = new ArrayList<>();

    public static void imprimir() {
        int opcion;

        do {
            imprimirOpciones();
            opcion = LectorTeclado.leerInt("Ingrese su opción: ");
            ejecutarOpcion(opcion);
        } while (opcion != 0);

        System.out.println("Salir del programa ¡Hasta pronto!");
    }

    private static void ejecutarOpcion(int opcion) {
        if(opcion != 0) {
            try {
                accionHandler.getMapeo().get(opcion).ejecutar(listadoJuguetes);
            } catch (Exception exception) {
                System.out.println("Opción no válida, intentelo de nuevo");
            }
        }
    }

    private static void imprimirOpciones() {
        System.out.println("Menu de opciones:");
        accionHandler.getMapeo().values()
                .forEach(accion -> System.out.println(accion.obtenerOpcionComoString()));
        System.out.println("0. Salir");
    }
}
