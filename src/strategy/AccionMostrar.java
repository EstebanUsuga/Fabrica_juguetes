package src.strategy;

import src.Juguete;

import java.util.List;

public class AccionMostrar implements Accion {

    private static AccionMostrar instanciaAccion;
    private AccionMostrar(){}

    public static AccionMostrar getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionMostrar();
        } else {
            throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
        }

        return instanciaAccion;
    }



    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Juguetes Registrados:");
        for (Juguete juguete : juguetes) {
            juguete.mostrarDetalles();
            System.out.println("------------------------------");
        }

        return juguetes;
    }
}
