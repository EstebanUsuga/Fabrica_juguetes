package src.strategy;

import src.dominio.Juguete;
import src.util.LectorTeclado;

import java.util.List;

public class AccionEliminarPorId implements Accion {

    private static AccionEliminarPorId instanciaAccion;

    private AccionEliminarPorId(){}

    public static AccionEliminarPorId getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionEliminarPorId();
        }

        return instanciaAccion;
    }

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Eliminar Juguete:");
        int idEliminar = LectorTeclado.leerInt("Ingrese el ID del juguete que desea eliminar: ");
        eliminarJuguete(idEliminar, juguetes);
        return juguetes;
    }

    private void eliminarJuguete(int idEliminar, List<Juguete> listadoJuguetes) {
        for (Juguete juguete : listadoJuguetes) {
            if (juguete.getId() == idEliminar) {
                listadoJuguetes.remove(juguete);
                System.out.println("Juguete eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró un juguete con el ID especificado.");
    }
}
