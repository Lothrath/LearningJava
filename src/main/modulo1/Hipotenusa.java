package modulo1;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {

     //Recibir datos
     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite o valor de A: ");
     int a = scanner.nextInt();
     System.out.println("Digite o valor de B: ");
     int b = scanner.nextInt();

     //hopitenusa
     float h = (float)Math.sqrt((a*a)+(b*b));
     System.out.println("Hipotenusa = " + h);

    }
}
