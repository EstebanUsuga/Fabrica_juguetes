package src.strategy;

import src.dominio.Juguete;

import java.util.List;

public class AccionMostrar implements Accion {

    private static AccionMostrar instanciaAccion;

    private AccionMostrar(){}

    public static AccionMostrar getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionMostrar();
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
