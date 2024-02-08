package src.strategy;

import src.Juguete;

import java.util.List;

public class AccionMostrar implements Accion {

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
