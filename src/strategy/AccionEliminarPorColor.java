package src.strategy;

import src.dominio.Juguete;
import src.util.LectorTeclado;

import java.util.List;


public class AccionEliminarPorColor implements Accion {

    private static AccionEliminarPorColor instanciaAccion;
    private AccionEliminarPorColor(){}

    public static AccionEliminarPorColor getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionEliminarPorColor();
        }

        return instanciaAccion;
    }

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Eliminar Juguete por Color:");
        String colorEliminar = LectorTeclado.leerString("Ingrese el color del juguete que desea eliminar: ");

        eliminarJuguetesPorColor(colorEliminar, juguetes);

        return juguetes;
    }

    private void eliminarJuguetesPorColor(String colorEliminar, List<Juguete> juguetes) {
        juguetes.removeIf(juguete -> juguete.getColor().equalsIgnoreCase(colorEliminar));
        System.out.println("Juguetes con el color '" + colorEliminar + "' eliminados exitosamente.");
    }
}