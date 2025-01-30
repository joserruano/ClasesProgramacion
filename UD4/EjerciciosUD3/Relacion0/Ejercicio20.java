package UD4.EjerciciosUD3.Relacion0;

import java.util.Scanner;

// Crea una función llamada contarPalabrasEnCadena que reciba una cadena y devuelva el número de palabras que contiene, asumiendo que están separadas por espacios. Investiga el uso de split().

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String cadenaUsuario;
        int cantidadPalabras;

        System.out.println("Introduce una cadena:");
        cadenaUsuario = miScanner.nextLine();

        cantidadPalabras = contarPalabrasEnCadena(cadenaUsuario);

        System.out.println("La cadena " + cadenaUsuario + " contiene " + cantidadPalabras + " palabras");
    }

    // Si hay varios espacios en blanco, no funciona
    public static int contarPalabrasEnCadena(String cadena){
        String[] palabrasDeLaCadena = cadena.split(" ");
        return palabrasDeLaCadena.length;
    }
}
