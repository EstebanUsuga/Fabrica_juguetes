package src.factory;

import src.Juguete;

import java.util.Scanner;

public interface CreadorJuguete {

    Scanner scanner = new Scanner(System.in);

    Juguete crear();
}
