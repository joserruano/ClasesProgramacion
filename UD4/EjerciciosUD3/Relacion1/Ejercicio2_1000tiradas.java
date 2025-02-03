// Escribe una función llamada lanzarDado que devuelva un número entero aleatorio entre 1 y 6, como si estuvieras lanzando un dado. El número debe ser entre 1 y 6, incluyendo ambos.

import java.util.ArrayList;

public class Ejercicio2_1000tiradas {

    static final int numeroDeCaras = 6;
    static final int numeroDeTiradas = 1000;
    static final int numeroDeDados = 2;

    public static void main(String[] args) {

        ArrayList<Integer> resultados = new ArrayList<>();

        for (int i = 0; i <= (numeroDeDados * numeroDeCaras); i++) {
            resultados.add(0);
        }

        for (int i = 0; i < numeroDeTiradas; i++) {
            int sumaDeLaTirada = lanzarDados(numeroDeDados, numeroDeCaras);
            
            int resultadoActual = resultados.get(sumaDeLaTirada); // Las veces que ha salido anteriormente esa combinación de dados.
            resultados.set(sumaDeLaTirada, resultadoActual + 1 );
        }

        System.out.println(resultados);

    }

    public static int lanzarDados(int numeroDeDados, int numeroDeCaras) {
        int sumaDados = 0;

        for (int i = 0; i < numeroDeDados; i++) {
            sumaDados += lanzarDado(numeroDeCaras);
        }

        return sumaDados;
    }

    public static int lanzarDado(int caras) {
        return numeroAleatorio(1, caras);
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
