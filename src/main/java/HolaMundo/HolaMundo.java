package HolaMundo;

public class HolaMundo {
    public static void main (String[] args) {
        System.out.println("Hola Mundo");

        String nombre = "Java language"; // Forma literal (recomendada)
        String language = new String("Python"); // Usando constructor
        System.out.println(nombre.length()); // 
        
        System.out.println(nombre);
        System.out.println(language);

        String persona = "Pedro";
        System.out.println(persona);
        persona = "Andrea";
        System.out.println(persona);

        int edad = 23;

        // Arreglos
        int[] numeros = {10, 20, 30};
        String[] palabras = new String[3];
        palabras[0] = "palabra index 0";
        palabras[1] = "palabra index 1";
        palabras[2] = "palabra index 2";
        System.out.println(numeros[2]);
        System.out.println(palabras[1]);

        Persona persona1 = new Persona("Zaleht", 21);
        persona1.saludar();

        // Upcasting


        // Conversión de tipo de datos
        String edadTexto = "23";
        int textoEdad = Integer.parseInt(edadTexto);
        System.out.println(edadTexto + 22);
        System.out.println(textoEdad + 22);

        int numero = 777;
        String texto = String.valueOf(numero);
        System.out.println(numero + 23);
        System.out.println(texto + 23);
    }
}
