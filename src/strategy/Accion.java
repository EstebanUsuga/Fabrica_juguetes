package src.strategy;

import src.dominio.Juguete;

import java.util.List;
import java.util.Scanner;

public interface Accion {

    List<Juguete> ejecutar(List<Juguete> juguetes);

    String obtenerOpcionComoString();

    int obtenerOpcion();

    default String formatearMensaje(String mensaje) {
        return String.format("%d. %s", obtenerOpcion(), mensaje); // "opcion. mensaje"
    }
}


