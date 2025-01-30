package UD4.EjerciciosUD3.Relacion0;

import java.util.Scanner;

// 19. Capitalizar la primera letra de una palabra
// Crea una función llamada capitalizarPrimeraLetra que reciba una palabra y devuelva la misma palabra con la primera letra en mayúscula. Investiga el uso de toUpperCase().

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String cadenaUsuario, cadenaCapitalizada;

        System.out.println("Introduce una cadena:");
        cadenaUsuario = miScanner.nextLine();

        cadenaCapitalizada = capitalizarPrimeraLetra(cadenaUsuario);

        System.out.println(cadenaCapitalizada);
    }

    /**
     * Recibe una cadena y la devuelve con la primera letra en mayúscula.
     * 
     * @param cadena cadena introducida por el usuario
     * @return cadena con primera letra capitalizada
     */
    public static String capitalizarPrimeraLetra(String cadena) {

        char primeraLetraMayuscula = cadena.toUpperCase().charAt(0);
        String cadenaCapitalizada = "";

        cadenaCapitalizada += primeraLetraMayuscula;
        for (int i = 1; i < cadena.length(); i++) {
            cadenaCapitalizada += cadena.charAt(i);
        }

        return cadenaCapitalizada;

    }
}
