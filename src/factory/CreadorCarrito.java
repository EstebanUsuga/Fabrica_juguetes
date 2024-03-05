package src.factory;

import src.dominio.Carrito;
import src.dominio.Juguete;
import src.util.LectorTeclado;

public class CreadorCarrito implements Creador {

    private static CreadorCarrito instancia;

    private CreadorCarrito() {}

    public Juguete crear() {
        System.out.println("Crear un Carrito");
        String tipoCarrito = LectorTeclado.leerString("Ingrese el tipo de carrito:  ");
        String colorCarrito = LectorTeclado.leerString("Ingrese el color: ");
        String marcaCarrito = LectorTeclado.leerString("Ingrese la marca: ");
        int numeroPuertasCarrito = LectorTeclado.leerInt("Ingrese el número de puertas: ");

        return Carrito.builder()
                .id(Juguete.contadorId++)
                .color(colorCarrito)
                .marca(marcaCarrito)
                .tipo(tipoCarrito)
                .numeroPuertas(numeroPuertasCarrito)
                .build();
    }

    public static CreadorCarrito getInstance() {
        if(instancia == null) {
            instancia =  new CreadorCarrito();
        }
        return instancia;
    }
}
