package src;//Fábrica de Juguetes
//
//Hay una fábrica de juguetes que está especializada en producir peluches y carritos.
//Esta fábrica quiere automatizar los procesos de creación y registro de los diferentes juguetes que se producen en el día.
//
//Creación:
//a. Implementación para la creación de Peluche, en la cual se le pedirá al
//usuario ingresar los atributos materialExterior, relleno y color.
//b. Implementación para la creación de src.Carrito, en la cual se le pedirá al
//usuario ingresar los atributos color, marca y numeroPuertas.
//c. El elemento creado debe ser agregado a la lista.
//
//Registro:
//Imprimir todos los juguetes que se llevan hasta ahora en la lista, con
//sus respectivos atributos.

public class Juguete {

    public static int contadorId = 1;

    private String color;
    private int id;


    public Juguete(String color, int id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }



    @Override
    public Juguete clone() throws CloneNotSupportedException {
        return (Juguete) super.clone();
    }

    public void mostrarDetalles() {
        System.out.println("ID: " + id + " | Color: " + color);
    }
}