package HolaMundo;

// Definición de clase

public class Persona {

    // ARRAY (CONJUNTO )
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

// Uso

// Persona persona1 = new Persona("Ana", 25);
// persona1.saludar(); // "Hola, soy Ana"