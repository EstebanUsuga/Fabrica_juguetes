package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Juguete> listadoJuguetes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Crear Peluche");
            System.out.println("2. Crear Carrito");
            System.out.println("3. Clonar Juguete");
            System.out.println("4. Eliminar Juguete");
            System.out.println("5. Mostrar Juguetes Registrados");
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
                    System.out.println("Clonar Juguete:");
                    System.out.print("Ingrese el ID del juguete que desea clonar: ");
                    int idClonar = teclado.nextInt();
                    System.out.print("Ingrese el número de clones que desea crear: ");
                    int cantidadClones = teclado.nextInt();
                    try {
                        clonarJuguete(idClonar, cantidadClones, listadoJuguetes);
                    } catch (CloneNotSupportedException e) {
                        System.out.println("Error al clonar el juguete.");
                    }
                    break;
                case 4:
                    System.out.println("Eliminar Juguete:");
                    System.out.print("Ingrese el ID del kuguete que desea eliminar: ");
                    int idEliminar = teclado.nextInt();
                    eliminarJuguete(idEliminar, listadoJuguetes);
                    break;
                case 5:
                    System.out.println("Juguetes Registrados:");
                    for (Juguete juguete : listadoJuguetes) {
                        juguete.mostrarDetalles();
                        System.out.println("------------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Salir del programa ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
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
        System.out.print("Ingrese el ID del peluche: ");
        int idPeluche = teclado.nextInt();
        teclado.nextLine();
        Peluche peluchito = new Peluche(colorPeluche, materialExteriorPeluche, rellenoPeluche, idPeluche);
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

        System.out.print("Ingrese el ID del carrito: ");
        int idCarrito = teclado.nextInt();
        teclado.nextLine();

        Carrito carrote = new Carrito(colorCarrito, marcaCarrito, numeroPuertasCarrito, tipoCarrito, idCarrito);
        return carrote;
    }

    private static void clonarJuguete(int idClonar, int cantidadClones, List<Juguete> listadoJuguetes) throws CloneNotSupportedException {
        for (Juguete juguete : listadoJuguetes) {
            if (juguete.getId() == idClonar) {
                for (int i = 0; i < cantidadClones; i++) {
                    listadoJuguetes.add(juguete.clone());
                }
                System.out.println("Juguete clonado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró un juguete con el ID especificado.");
    }

    private static void eliminarJuguete(int idEliminar, List<Juguete> listadoJuguetes) {
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