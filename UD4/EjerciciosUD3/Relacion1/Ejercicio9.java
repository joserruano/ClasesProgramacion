
// 9. Generar una Contraseña Aleatoria de Longitud Fija
// Escribe una función generarContraseña que reciba un número longitud y devuelva una cadena de caracteres aleatorios (formada por letras y números) de esa longitud. Por ejemplo, si longitud es 8, podría devolver algo como a7b3f2d8. Puedes usar un array de letras y números para ir eligiendo de forma aleatoria.

public class Ejercicio9 {
    public static void main(String[] args) {

        System.out.println(generarContrasenia(8));
    }

    public static String generarContrasenia(int longitud) {
        char[] caracteres = { '1', '2', '3', 'a', 'A', 'b', 'B', 'c', 'C' };

        String contrasenia = "";

        for (int i = 0; i < longitud; i++) {
            int posicionAleatoria = numeroAleatorio(0, caracteres.length - 1);

            contrasenia += caracteres[posicionAleatoria];
            // contrasenia += caracteres.get(posicionAleatoria); <= Si caracteres fuera ArrayList
        }

        return contrasenia;
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
