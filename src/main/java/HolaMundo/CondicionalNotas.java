package HolaMundo;

import java.util.Scanner;

public class CondicionalNotas {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("CALCULE SU NOTA");
        System.out.println("================");
        
        // Primera manera de hacerlo
        /* 
        System.out.print("Ingrese su nota: ");
        Scanner sc = new Scanner(System.in);
        
        int nota = sc.nextInt();
        
        if (nota >= 9) {
            System.out.println("Excelente");   
        } else if (nota >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
        */
        
        // Segunda manera de hacerlo
        /*
        System.out.print("Ingrese su nota: ");
        Scanner sc = new Scanner(System.in);
        
        int nota = sc.nextInt();
        String informacion;
        
        if (nota >= 9 ) {
            informacion = "Excelente";
        } else if (nota >= 6) {
            informacion = "Aprobado";
        } else {
            informacion = "Desaprobado";
        }
        System.out.println(informacion.toUpperCase());
        sc.close();
        */
        
        // Tercera manera de hacerlo
        System.out.print("Ingrese su nota: ");
        Scanner sc = new Scanner(System.in);
        
        int nota = sc.nextInt();
        
        String informacion = switch (nota) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 -> "Desaprobado";
            case 12, 13, 14, 15, 16 -> "Aprobado";
            case 17, 18, 19, 20 -> "Excelente";
            default -> "Nota ínvalida";
        };
        
        System.out.println(informacion.toUpperCase());
        sc.close();
    }
}
