package src.strategy;

import src.Juguete;

import java.util.List;
import java.util.Scanner;

public interface Accion {

    Scanner scanner = new Scanner(System.in);

    List<Juguete> ejecutar(List<Juguete> juguetes);
}
