public class Carrito extends Juguete {
  private String marca;
  private int numeroPuertas;

  private String tipo;

    public Carrito(String color, String marca, int numeroPuertas, String tipo) {
        super(color);
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.tipo = tipo;
    }

    public void mostrarDetalles() {
        System.out.println("*********************");
        System.out.println("*      Carrito     *");
        System.out.println("*********************");
        super.mostrarDetalles();
        System.out.println("Marca: " + marca);
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Tipo de carrito: "+ tipo);
    }



}
