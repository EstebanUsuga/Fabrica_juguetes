package src;

public class Peluche extends Juguete implements Cloneable {
    private String materialExterior;
    private String relleno;

    public Peluche(String color, String materialExterior, String relleno, int id) {
        super(color, id);
        this.materialExterior = materialExterior;
        this.relleno = relleno;
    }

    public String getMaterialExterior() {
        return materialExterior;
    }

    public void setMaterialExterior(String materialExterior) {
        this.materialExterior = materialExterior;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    @Override
    public Peluche clone() throws CloneNotSupportedException {
        return (Peluche) super.clone();
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Material Exterior: " + materialExterior + " | Relleno: " + relleno);
    }
}