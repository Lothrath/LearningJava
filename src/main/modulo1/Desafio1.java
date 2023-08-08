package modulo1;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        //Declaracion de variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        int r1 = sc.nextInt();
        System.out.println("Digite el segundo número: ");
        int r2 = sc.nextInt();
        System.out.println("Digite el tercer número: ");
        int r3 = sc.nextInt();

        //Calculo de la resistencia total
        double rt = ((1.0)/(1.0/r1)+(1.0/r2)+(1.0/r3));
        System.out.println("El resultado es: " + rt + " Resistencia total en ohms");

    }

}
