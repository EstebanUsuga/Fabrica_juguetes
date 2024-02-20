package src.strategy;
import src.Peluche;
import src.Juguete;
import src.Carrito;

import java.util.List;

public class AccionMostrarPorTipo implements Accion {


    private static AccionMostrarPorTipo instanciaAccion;
    private AccionMostrarPorTipo(){}

    public static AccionMostrarPorTipo getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionMostrarPorTipo();
        } else {
            throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
        }

        return instanciaAccion;
    }

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {

        System.out.println("Ingrese el tipo de juguete que desea mostrar: ");
        System.out.println("1. Peluches                       2. Carritos");
        int tipoJuguete = scanner.nextInt();

        System.out.println(tipoJuguete == 1 ? "________________________PELUCHES______________________________________" :
                "________________________CARRITOS______________________________________");

        for (Juguete juguete : juguetes) {
            if ((tipoJuguete == 1 && juguete instanceof Peluche) || (tipoJuguete == 2 && juguete instanceof Carrito)) {
                System.out.println(juguete.mostrarDetalles());

            }


        }
        return juguetes;


    }
}
