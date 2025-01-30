package UD4.EjerciciosUD3.Relacion0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 13. Invertir un array
// Crea una función llamada invertirArray que reciba un array y devuelva un nuevo array con los elementos en orden inverso.

public class Ejercicio13 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(array));

        ArrayList<Integer> listaInvertida = invertirArray(listaNumeros);

        System.out.println(listaInvertida);
    }

    public static ArrayList<Integer> invertirArray(ArrayList<Integer> listaNumeros){
        ArrayList<Integer> listaInvertida = new ArrayList<Integer>();

        for (int i = listaNumeros.size() - 1; i >= 0; i--) {
            int numeroActual = listaNumeros.get(i);
            listaInvertida.add(numeroActual);
        }

        return listaInvertida;
    }
}
