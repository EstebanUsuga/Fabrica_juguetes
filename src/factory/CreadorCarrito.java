package src.factory;

import src.Carrito;
import src.Juguete;

public class CreadorCarrito implements CreadorJuguete {

    @Override
    public Juguete crear() {
        System.out.println("Crear un Carrito");
        System.out.print("Ingrese el tipo de carrito:  ");
        String tipoCarrito = scanner.nextLine();
        System.out.print("Ingrese el color: ");
        String colorCarrito = scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marcaCarrito = scanner.nextLine();
        System.out.print("Ingrese el número de puertas: ");
        int numeroPuertasCarrito = scanner.nextInt();
        scanner.nextLine();

        return Carrito.builder()
                .id(Juguete.contadorId++)
                .color(colorCarrito)
                .marca(marcaCarrito)
                .tipo(tipoCarrito)
                .numeroPuertas(numeroPuertasCarrito)
                .build();
    }
}
