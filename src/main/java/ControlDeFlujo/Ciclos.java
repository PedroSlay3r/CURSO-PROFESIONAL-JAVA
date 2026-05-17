package ControlDeFlujo;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        // FOR
        System.out.println("=== FOR ===");
        int ciclo;

        System.out.print("Ingrese su número: ");
        ciclo = teclado.nextInt();
        for (int i = 1; i <= ciclo; i++) {
            System.out.println("Iteración " + i);
        }

        // WHILE
        System.out.println("=== WHILE ===");
        int contador, maximo;
        System.out.print("Ingrese su contador: ");
        contador = teclado.nextInt();
        System.out.print("Ingrese su maximo: ");
        maximo = teclado.nextInt();

        while (contador <= maximo) {
            System.out.println("Contador: " + contador);
            contador ++;
        }

    }
}
