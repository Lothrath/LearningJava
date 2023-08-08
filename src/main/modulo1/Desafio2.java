package modulo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Recibir primera fecha
        System.out.println("Ingrese la primera fecha en el formato (yyyy-MM-dd):");
        String fecha1 = sc.nextLine();

        //Recibir segunda fecha
        System.out.println("Ingrese la segunda fecha en el formato (yyyy-MM-dd):");
        String fecha2 = sc.nextLine();

        // Crear SimpleDateFormat para parsear las fechas
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {

            //Parse the imput to Date object
            Date date1 = sdf.parse(fecha1);
            Date date2 = sdf.parse(fecha2);

            //comparar fechas
            int comparison = date1.compareTo(date2);

            //Se comparan las fechas
            if (comparison < 0) {
                System.out.println("La primera fecha es mas reciente que la primera");
            } else if (comparison > 0) {
                System.out.println("La segunda fecha es mas reciente que la primera");
            } else {
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
