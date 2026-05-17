package ControlDeFlujo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== INGRESE EL NÚMERO DEL DÍA ===");
        int dia;

        System.out.print("Ingrese el día: ");
        dia = teclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Es el día domingo");
                break;
                
            case 2:
                System.out.println("Es el día lunes");
                break;

            case 3:
                System.out.println("Es el día martes");
                break;

            case 4:
                System.out.println("Es el día miércoles");
                break;

            case 5:
                System.out.println("Es el día jueves");
                break;

            case 6:
                System.out.println("Es el día viernes");
                break;

            case 7:
                System.out.println("Es el día sábado");
                break;
        
            default:
                System.out.println("Día ínvalido");
                break;
        }


    }
}
