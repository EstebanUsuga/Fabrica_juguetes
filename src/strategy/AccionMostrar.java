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
        juguetes.forEach(juguete -> {
            juguete.mostrarDetalles();
            System.out.println("------------------------------");
        });

        return juguetes;
    }

    @Override
    public String obtenerOpcionComoString() {
        return formatearMensaje("Mostrar Juguetes Registrados"); //4. Mostrar Juguetes Registrados
    }

    @Override
    public int obtenerOpcion() {
        return 4;
    }
}
