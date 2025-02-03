package EjerciciosUD3.Relacion2;

// 1. Generar nombres de usuario
// Crea una función que reciba un nombre y un apellido y genere un nombre de usuario único. Usa las tres primeras letras del nombre y del apellido, y agrega tres números aleatorios al final. Investiga el uso de toLowerCase().

public class Ejercicio1 {

    static final int longitudSubcadena = 3;

    public static void main(String[] args) {

        String nick = generarNick("Pi", "Moreno");

        System.out.println(nick);

    }

    public static String generarNick(String nombre, String apellido) {

        String nick = "";

        nick += primerasLetras(nombre, longitudSubcadena);
        nick += primerasLetras(apellido, longitudSubcadena);

        for (int i = 0; i < longitudSubcadena; i++) {
            nick += numeroAleatorio(0, 9);
        }

        return nick.toLowerCase();

    }

    public static String primerasLetras(String cadena, int longitud) {

        int limite = (cadena.length() < longitud) ? cadena.length() : longitud; // Operador ternario. En este caso, buscamos el menor tamaño entre la longitud recibida y el tamaño de la cadena.

        return cadena.substring(0, limite);

    }

    // public static String primerasLetras(String cadena, int longitud) {

    //     String subcadena = "";

    //     int limite;
    //     if (cadena.length() < longitud) {
    //         limite = cadena.length();
    //     }else{
    //         limite = longitud;
    //     }

    //     for (int i = 0; i < limite; i++) {
    //         subcadena += cadena.charAt(i);
    //     }

    //     return subcadena;

    // }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

}
