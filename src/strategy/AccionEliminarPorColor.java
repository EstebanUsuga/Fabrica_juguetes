package src.strategy;

import src.Juguete;

import java.util.List;


public class AccionEliminarPorColor implements Accion {

    private static AccionEliminarPorColor instanciaAccion;
    private AccionEliminarPorColor(){}

    public static AccionEliminarPorColor getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionEliminarPorColor();
        } else {
            throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
        }

        return instanciaAccion;
    }

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Eliminar Juguete por Color:");
        System.out.print("Ingrese el color del juguete que desea eliminar: ");
        String colorEliminar = scanner.nextLine();

        eliminarJuguetesPorColor(colorEliminar, juguetes);

        return juguetes;
    }

    private void eliminarJuguetesPorColor(String colorEliminar, List<Juguete> juguetes) {
        juguetes.removeIf(juguete -> juguete.getColor().equalsIgnoreCase(colorEliminar));
        System.out.println("Juguetes con el color '" + colorEliminar + "' eliminados exitosamente.");
    }
}