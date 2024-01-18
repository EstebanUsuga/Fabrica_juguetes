import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // se crea un arraylist para almacenar las instancias de juguete peluche y carrito
        List<Juguete> listadoJuguetes = new ArrayList<Juguete>();

        System.out.println("Crear un Peluche ");
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

        // se instancia la clase Peluche para crear un nuevo objeto
        Peluche peluchito = new Peluche(colorPeluche, materialExteriorPeluche, rellenoPeluche, sonidoPeluche, alturaPeluche);
        //se envia el objeto creado con nombre peluchito al arrayList por medio del add
        listadoJuguetes.add(peluchito);


        // Estrucuta para crear el carrito
        System.out.println("Crer un Carrito");
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
        //Se envía el objeto creado con nombre carrote al arrayList por medio del add
        listadoJuguetes.add(carrote);

        // utilizamos for each para recorrer la lista y que muestre los detalles de cada juguete que se registre
        System.out.println("Juguetes Registrados:");
            for (Juguete juguete : listadoJuguetes) {
            juguete.mostrarDetalles();
            System.out.println("------------------------------");
        }

    }

}