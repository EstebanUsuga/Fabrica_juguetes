package src.strategy;

import src.dominio.Juguete;
import src.factory.CreadorCarrito;
import src.factory.CreadorPeluche;
import src.util.LectorTeclado;

import java.util.List;

public class AccionCrear implements Accion {

    private static AccionCrear instancia;

    private AccionCrear() {}

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("¿Qué desea crear?");
        System.out.println("1. Peluche");
        System.out.println("2. Carrito");
        int opcion = LectorTeclado.leerInt("Opcion: ");

        switch(opcion) {
            case 1 -> juguetes.add(CreadorPeluche.getInstance().crear());
            case 2 -> juguetes.add(CreadorCarrito.getInstance().crear());
            default -> System.out.println("Opción no válida");
        }

        return juguetes;
    }

    @Override
    public String obtenerOpcionComoString() {
        return formatearMensaje("Crear Juguete"); // 1. Crear Juguete
    }

    @Override
    public int obtenerOpcion() {
        return 1;
    }

    public static AccionCrear getInstance() {
        if(instancia == null) {
            instancia =  new AccionCrear();
        }
        return instancia;
    }
}
