package HolaMundo;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre =  teclado.nextLine();
        //System.out.println("Ingresa tu apellido:");
        //String apellido =  teclado.nextLine();
        System.out.println("Ingresa tu edad:");
        String edad =  teclado.nextLine();
        teclado.close();

        // System.out.println("Hola " + nombre + " " + apellido + " tienes " + edad);
        System.out.println("Hola " + nombre + " tienes " + edad);

        // Existen
        // nextLine();
        // next();
        // nextInt();
        // nextDouble():
    }
}
