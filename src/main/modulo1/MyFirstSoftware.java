package modulo1;

import java.util.Scanner;

public class MyFirstSoftware {

    public static void main(String[] args) {

        //se crea el objeto scanner
        System.out.println("Escriba una linea de texto");
        Scanner scanner = new Scanner(System.in);
        //leemos la linea
        String i = scanner.nextLine();
        //Imprimimos la linea
        System.out.println(i);

    }

}
