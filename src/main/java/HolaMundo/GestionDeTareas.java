package HolaMundo;

import java.util.Scanner;

public class GestionDeTareas {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int totalPrioridad = 0;

        System.out.println("==================");
        System.out.println("GESTOR DE TAREAS");
        System.out.println("==================");
        System.out.println("1. Agregar tareas");
        System.out.println("2. Ver tareas (pendientes)");
        System.out.println("3. Salir");
        System.out.println("==================");

        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar

        // Validación, que esté entre 1 y 3
        if (opcion >= 1 && opcion <= 3) {
            if (opcion == 1) {
                System.out.print("Nombre de la tarea: ");
                String nombreTarea = sc.nextLine();

                System.out.print("Prioridad (1 - 5): ");
                int prioridad = sc.nextInt();

                // Validación básica con operador lógico
                boolean esValida = prioridad >= 1 && prioridad <= 5;
                System.out.println("¿Prioridad válida? " + esValida);

                // Operación aritmética: suma de prioridades
                totalPrioridad += prioridad;

                System.out.println("Tarea agregada: " + nombreTarea + " (prioridad " + prioridad + ")");
                System.out.println("Suma total de prioridades: " + totalPrioridad);
            } else if (opcion == 2) {
                System.out.println("Función 'ver tareas' aún no implementada.");
            } else {
                System.out.println("¡Hasta luego!");
            }
        } else {
            System.out.println("Opción inválida.");
        }
        sc.close();
    }
}
