package src.strategy;

import src.Juguete;

import java.util.List;

public class AccionClonar implements Accion {

    private static AccionClonar instanciaAccion;
    private AccionClonar() {}

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        System.out.println("Clonar Juguete:");
        System.out.print("Ingrese el ID del juguete que desea clonar: ");
        int idClonar = scanner.nextInt();
        System.out.print("Ingrese el número de clones que desea crear: ");
        int cantidadClones = scanner.nextInt();
        try {
            clonarJuguete(idClonar, cantidadClones, juguetes);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error al clonar el juguete.");
        }

        return juguetes;
    }

        public static Accion getInstance() {
            if (instanciaAccion == null){
                instanciaAccion = new AccionClonar();
            }else {
                throw new IllegalStateException("Ya se ha creado una instancia de esta accion.");
            }
            return instanciaAccion;    }

    private void clonarJuguete(int idClonar, int cantidadClones, List<Juguete> listadoJuguetes) throws CloneNotSupportedException {
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
}
