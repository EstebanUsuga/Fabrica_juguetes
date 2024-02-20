package src.strategy;

import src.Carrito;
import src.Juguete;

import java.util.List;

public class AccionCrearCarrito implements Accion {

    private static AccionCrearCarrito instanciaAccion;
    private AccionCrearCarrito(){}


        public static AccionCrearCarrito getInstance() {
            if (instanciaAccion == null){
                instanciaAccion = new AccionCrearCarrito();
            }else{
                throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
            }
            return instanciaAccion;
        }



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

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        return null;
    }
}
