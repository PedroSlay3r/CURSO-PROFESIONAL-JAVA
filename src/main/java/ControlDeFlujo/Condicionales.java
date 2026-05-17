package ControlDeFlujo;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== VERIFICADOR DE EDAD ===");
        int edad;

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        System.out.println("=== VERIFICADOR DE NOTAS ===");
        int calificacion;

        System.out.print("Ingrese su nota: ");
        calificacion = teclado.nextInt();

        if (calificacion >= 17) {
            System.out.println("Nota excelente");
        } else if (calificacion >= 12) {
            System.out.println("Nota aprobatoria");
        } else {
            System.out.println("Nota desaprobatoria");
        }
    }
}
