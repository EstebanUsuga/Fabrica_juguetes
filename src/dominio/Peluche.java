package src.dominio;

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

    public String getRelleno() {
        return relleno;
    }

    @Override
    public Peluche clone() throws CloneNotSupportedException {
        return (Peluche) super.clone();
    }

    public static PelucheBuilder builder() {
        return new PelucheBuilder();
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Material Exterior: " + materialExterior + " | Relleno: " + relleno);
    }

    public static class PelucheBuilder {

        private String materialExterior;
        private String relleno;
        private int id;
        private String color;

        private PelucheBuilder() {}

        public PelucheBuilder materialExterior(String materialExterior) {
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PelucheBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Peluche build() {
            return new Peluche(color, materialExterior, relleno, id);
        }
    }
}