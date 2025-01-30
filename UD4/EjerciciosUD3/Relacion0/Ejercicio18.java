package UD4.EjerciciosUD3.Relacion0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Crea una función llamada contarVocalesEnCadena que reciba una cadena de texto y devuelva la cantidad total de vocales que contiene.

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String cadenaUsuario;
        int cantidadVocales;

        System.out.println("Introduce una cadena:");
        cadenaUsuario = miScanner.nextLine();

        cantidadVocales = contarVocalesEnCadena(cadenaUsuario);

        System.out.println("La cadena " + cadenaUsuario + " contiene " + cantidadVocales + " vocales");
    }

    public static int contarVocalesEnCadena(String cadena){

        String cadenaMayusculas = cadena.toUpperCase();
        int numeroVocales = 0;

        for (int i = 0; i < cadenaMayusculas.length(); i++) {
            char letraActual = cadenaMayusculas.charAt(i); // Saco la letra de la posición i
            boolean letraEsVocal = esVocal(letraActual);

            if (letraEsVocal) {
                numeroVocales++;
            }
        }

        return  numeroVocales;
    }

    public static boolean esVocal(char letra){
        Character[] listaVocales = {'A', 'E', 'I', 'O', 'U'};
        ArrayList<Character> vocales = new ArrayList<>(Arrays.asList(listaVocales));

        return vocales.contains(letra);
    }

    // public static boolean esVocal(char letra){
    //     char[] vocales = {'A', 'E', 'I', 'O', 'U'};
    //     boolean esVocal = false;

    //     for (int i = 0; i < vocales.length && !esVocal; i++) {
    //         if(vocales[i] == letra){
    //             esVocal = true;
    //         }
    //     }

    //     return esVocal;
    // }

    // String => length()
    // array[] => length
    // ArrayList => size()
}
