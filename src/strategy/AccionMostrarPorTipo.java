package src.strategy;
import src.dominio.Peluche;
import src.dominio.Juguete;
import src.dominio.Carrito;
import src.util.LectorTeclado;

import java.util.List;

/**
 * Condicionales statement (no tiene retorno)
 *
 *  if(x == 0) {
 *  }
 *
 * Condionales expression (si tiene retorno)
 *
 * int y = (condición) ? (el caso true) : (caso false) (operador ternario)
 *
 */

public class AccionMostrarPorTipo implements Accion {

    private static AccionMostrarPorTipo instanciaAccion;

    private AccionMostrarPorTipo(){}

    public static AccionMostrarPorTipo getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionMostrarPorTipo();
        }

        return instanciaAccion;
    }

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Ingrese el tipo de juguete que desea mostrar: ");
        int tipoJuguete = LectorTeclado.leerInt("1. Peluches                       2. Carritos");

        System.out.println(tipoJuguete == 1 ?
                "________________________PELUCHES______________________________________" :
                "________________________CARRITOS______________________________________");

        for(Juguete juguete : juguetes) {
            if ((tipoJuguete == 1 && juguete instanceof Peluche) || (tipoJuguete == 2 && juguete instanceof Carrito)) {
                juguete.mostrarDetalles();
            }
        }

        return juguetes;
    }
}
