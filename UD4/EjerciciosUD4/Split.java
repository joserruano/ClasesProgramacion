package EjerciciosUD4;

import java.util.ArrayList;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String cadenaUsuario;

        ArrayList<String> arrayPalabras = new ArrayList<String>();

        System.out.println("Introduce una cadena:");
        cadenaUsuario = miScanner.nextLine();

        arrayPalabras = split(cadenaUsuario, ' ');

        System.out.println(arrayPalabras);
    }

    public static ArrayList<String> split(String cadena, char separador) {
        ArrayList<String> arrayPalabras = new ArrayList<String>();

        String palabraAuxiliar = "";

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);

            if (caracterActual != separador) {
                palabraAuxiliar += caracterActual;

            } else if (palabraAuxiliar.length() != 0) {
                arrayPalabras.add(palabraAuxiliar);
                palabraAuxiliar = "";
            }
        }

        if (palabraAuxiliar.length() != 0) { // Si la palabra auxiliar no esta vacía al terminar el bucle (última palabra)
            arrayPalabras.add(palabraAuxiliar);
        }

        return arrayPalabras;

    }
}