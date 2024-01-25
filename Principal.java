import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Juguete> listadoJuguetes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Crear Peluche");
            System.out.println("2. Crear Carrito");
            System.out.println("3. Mostrar Juguetes Registrados");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Crear un Peluche ");
                    Peluche peluchito = crearPeluche(teclado);
                    listadoJuguetes.add(peluchito);
                    break;
                case 2:
                    System.out.println("Crear un Carrito");
                    Carrito carrote = crearCarrito(teclado);
                    listadoJuguetes.add(carrote);
                    break;
                case 3:
                    System.out.println("Juguetes Registrados:");
                    for (Juguete juguete : listadoJuguetes) {
                        juguete.mostrarDetalles();
                        System.out.println("------------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Salir del programa ¡Hasta pronto!");
                    break;

            }

        } while (opcion != 0);

        teclado.close();
    }

    private static Peluche crearPeluche(Scanner teclado) {
        System.out.print("Ingrese el color: ");
        String colorPeluche = teclado.nextLine();
        System.out.print("Ingrese el material exterior: ");
        String materialExteriorPeluche = teclado.nextLine();
        System.out.print("Ingrese el relleno: ");
        String rellenoPeluche = teclado.nextLine();
        System.out.print("Ingrese el sonido: ");
        String sonidoPeluche = teclado.nextLine();
        System.out.print("Ingrese la altura: ");
        double alturaPeluche = teclado.nextDouble();
        teclado.nextLine();

        Peluche peluchito = new Peluche(colorPeluche, materialExteriorPeluche, rellenoPeluche, sonidoPeluche, alturaPeluche);
        return peluchito;
    }

    private static Carrito crearCarrito(Scanner teclado) {
        System.out.print("Ingrese el tipo de carrito:  ");
        String tipoCarrito = teclado.nextLine();
        System.out.print("Ingrese el color: ");
        String colorCarrito = teclado.nextLine();
        System.out.print("Ingrese la marca: ");
        String marcaCarrito = teclado.nextLine();
        System.out.print("Ingrese el número de puertas: ");
        int numeroPuertasCarrito = teclado.nextInt();
        teclado.nextLine();

        Carrito carrote = new Carrito(colorCarrito, marcaCarrito, numeroPuertasCarrito, tipoCarrito);
        return carrote;
    }
}