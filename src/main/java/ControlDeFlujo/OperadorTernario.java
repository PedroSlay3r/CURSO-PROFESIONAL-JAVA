package ControlDeFlujo;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== VALIDACIÓN TERNARIO DE EDAD ===");
        int edad;

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        String validacion = (edad >= 18) ? "Eres un adulto" : "Eres un menor de edad";
        System.out.println(validacion);

    }
}
