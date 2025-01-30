package UD4.EjerciciosUD3.Relacion0;

import java.util.ArrayList;
import java.util.Arrays;

// Crea una función llamada filtrarNumerosMayores que reciba un array de números y un valor, y devuelva un nuevo array con los números mayores que el valor dado.

public class Ejercicio15 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(array));

        ArrayList<Integer> listaNumerosMayores = filtrarNumerosMayores(listaNumeros, 3);

        System.out.println(listaNumerosMayores);
    }

    public static ArrayList<Integer> filtrarNumerosMayores(ArrayList<Integer> listaNumeros, int valor){
        ArrayList<Integer> listaMayores = new ArrayList<Integer>(); //lista vacía

        for (Integer numero : listaNumeros) {
            if(numero > valor){
                listaMayores.add(numero);
            }
        }

        return listaMayores;
    }
}
