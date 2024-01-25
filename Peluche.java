public class Peluche extends Juguete {
    private String materialExterior;
    private String relleno;
    private String sonido;
    private double altura;

    public Peluche(String color, String materialExterior, String relleno, String sonido, double altura) {
        super(color);
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.sonido = sonido;
        this.altura = altura;
    }

    public void mostrarDetalles() {
        System.out.println("*********************");
        System.out.println("*      Peluche      *");
        System.out.println("*********************");
        super.mostrarDetalles();
        System.out.println("Material Exterior: " + materialExterior);
        System.out.println("Relleno: " + relleno);
        System.out.println("Sonido: "+ sonido);
        System.out.println("Altura: "+ altura);
    }
}