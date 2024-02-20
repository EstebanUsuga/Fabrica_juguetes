package src.strategy;

import src.Juguete;
import src.Peluche;

import java.util.List;

public class AccionCrearPeluche implements Accion {
    private static AccionCrearPeluche instanciaAccion;
    private AccionCrearPeluche(){}

        public static AccionCrearPeluche getInstance() {
            if (instanciaAccion == null) {
                instanciaAccion = new AccionCrearPeluche();
            } else {
                throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
            }

            return instanciaAccion;
        }


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

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        return null;
    }
}
