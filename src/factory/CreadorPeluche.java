package src.factory;

import src.Juguete;
import src.Peluche;

public class CreadorPeluche implements CreadorJuguete {

    @Override
    public Juguete crear() {
        System.out.println("Crear un Peluche ");
        System.out.print("Ingrese el color: ");
        String colorPeluche = scanner.nextLine();
        System.out.print("Ingrese el material exterior: ");
        String materialExteriorPeluche = scanner.nextLine();
        System.out.print("Ingrese el relleno: ");
        String rellenoPeluche = scanner.nextLine();
        return new Peluche(colorPeluche, materialExteriorPeluche, rellenoPeluche, Juguete.contadorId++);
    }
}
