package src.strategy;

import src.Juguete;

import java.util.Scanner;

public interface AccionCrearJuguete {

    Scanner scanner = new Scanner(System.in);

    Juguete crear();
}
