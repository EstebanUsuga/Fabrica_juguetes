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

    @Override
    public String obtenerOpcionComoString() {
        return formatearMensaje("Eliminar Juguete por ID"); //3. Eliminar Juguete por ID
    }

    @Override
    public int obtenerOpcion() {
        return 3;
    }

    private void eliminarJuguete(int idEliminar, List<Juguete> listadoJuguetes) {
        listadoJuguetes.stream()
                .filter(juguete -> juguete.getId() == idEliminar) //[]
                .findFirst()// 1 solo elemento
                .ifPresentOrElse(
                        juguete -> eliminarJuguete(juguete, listadoJuguetes),
                        () -> System.out.println("No se encontró un juguete con el ID especificado.")
                );
    }

    private void eliminarJuguete(Juguete juguete, List<Juguete> listadoJuguetes) {
        listadoJuguetes.remove(juguete);
        System.out.println("Juguete " + juguete.getId() + " ha sido eliminado");
    }
}
