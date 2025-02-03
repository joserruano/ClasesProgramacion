// Escribe una función llamada lanzarDado que devuelva un número entero aleatorio entre 1 y 6, como si estuvieras lanzando un dado. El número debe ser entre 1 y 6, incluyendo ambos.

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(lanzarDado(6));
    }

    public static int lanzarDado(int caras){
        return numeroAleatorio(1, caras);
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}

