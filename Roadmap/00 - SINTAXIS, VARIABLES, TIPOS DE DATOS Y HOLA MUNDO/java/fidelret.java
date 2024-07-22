/*
    #00 SINTAXIS, VARIABLES, TIPOS DE DATOS Y HOLA MUNDO

          Página web del lenguaje Java: https://www.oracle.com/java/
          Documentación del lenguaje Java: https://dev.java/

    Comentarios:
        Para comentarios en línea se utiliza doble barra: //.
        Para comentarios multilínea se utilizan los siguientes caracteres:
            /* (barra y asterísco) para iniciar y
            * / (asterísco y barra sin espacio intermedio) para cerrar el comentario.
 */

public class Main {
    public static void main(String[] args) {

        //Crea una variable (y una constante si el lenguaje lo soporta).

    String nombre = "Martín"; // Variable
    final double PI = 3.1416; // Constante

        // Crea variables representando todos los tipos de datos primitivos.

        boolean valorBoolean = true;
        byte valorByte = 1;
        char valorChar = 'A';
        short valorShort = 2;
        int valorInt = 3;
        long valorLong = 4;
        float valorFloat = 1.10f;
        double valorDouble = 0.22;

        // Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!

        System.out.println("¡Hola java!");
    }
}
