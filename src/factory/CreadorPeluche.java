package src.factory;

import src.dominio.Juguete;
import src.dominio.Peluche;
import src.util.LectorTeclado;

public class CreadorPeluche implements Creador {

    private static CreadorPeluche instancia;

    @Override
    public Juguete crear() {
        System.out.println("Crear un Peluche ");
        String colorPeluche = LectorTeclado.leerString("Ingrese el color: ");
        String materialExteriorPeluche = LectorTeclado.leerString("Ingrese el material exterior: ");
        String rellenoPeluche = LectorTeclado.leerString("Ingrese el relleno: ");
        return Peluche.builder()
                .id(Juguete.contadorId++)
                .color(colorPeluche)
                .materialExterior(materialExteriorPeluche)
                .relleno(rellenoPeluche)
                .build();
    }

    public static CreadorPeluche getInstance() {
        if(instancia == null) {
            instancia =  new CreadorPeluche();
        }
        return instancia;
    }
}
