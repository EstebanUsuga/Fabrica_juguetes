package src;

public class Carrito extends Juguete implements Cloneable {
    private String marca;
    private int numeroPuertas;
    private String tipo;

    public Carrito(String color, String marca, int numeroPuertas, String tipo, int id) {
        super(color, id);
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public Carrito clone() throws CloneNotSupportedException {
        return (Carrito) super.clone();
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" | Marca: " + marca + " | Número de Puertas: " + numeroPuertas + " | Tipo de Carrito: " + tipo);
    }

    public static CarritoBuilder builder() {
        return new CarritoBuilder();
    }

    public static class CarritoBuilder {

        private int id;
        private String color;
        private String marca;
        private int numeroPuertas;
        private String tipo;

        private CarritoBuilder() {
        }

        public CarritoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public CarritoBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Carrito build() {
            return new Carrito(color, marca, numeroPuertas, tipo, id);
        }
    }
}