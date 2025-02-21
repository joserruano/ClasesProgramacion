import java.util.Scanner;

public class Ejercicio2 {
    final static int CANTIDAD_LIBROS = 100;
    final static String OPCION_SALIDA = "5";

    final static Scanner miScanner = new Scanner(System.in);
    private static Biblioteca miBiblioteca;

    public static void main(String[] args) {

        inicializarBiblioteca();

        String opcion = "";
        while (!opcion.equals(OPCION_SALIDA)) {

            imprimirMenu();
            opcion = miScanner.nextLine();

            if (opcion.equals("1")) {
                agregarLibro();
            } else if (opcion.equals("2")) {
                prestarLibro();
            } else if (opcion.equals("3")) {
                devolverLibro();
            } else if (opcion.equals("4")) {
                System.out.println(miBiblioteca);
            }
        }

    }

    public static void inicializarBiblioteca() {
        miBiblioteca = new Biblioteca();
        for (int i = 0; i < CANTIDAD_LIBROS; i++) {
    Libro aleatorio = new Libro(Faker.lorem(3), Faker.nombreCompleto(), "Faker.loremLargo()");
            miBiblioteca.agregarLibro(aleatorio);
        }
    }

    public static void imprimirMenu() {
        System.out.println(
                "1. Agregar Libro.\n" +
                        "2. Prestar Libro.\n" +
                        "3. Devolver Libro.\n" +
                        "4. Imprimir fondo\n" +
                        "5. Salir");
    }

    public static void agregarLibro() {

        System.out.println("Introduzca el título del libro:");
        String titulo = miScanner.nextLine();

        System.out.println("Introduzca el autor del libro:");
        String autor = miScanner.nextLine();

        System.out.println("Introduzca la sinopsis del libro:");
        String sinopsis = miScanner.nextLine();

        Libro nuevoLibro = new Libro(titulo, autor, sinopsis);
        miBiblioteca.agregarLibro(nuevoLibro);
    }

    public static void prestarLibro() {
        System.out.println("Introduzca el id del libro:");
        int idLibro = miScanner.nextInt();
        miScanner.nextLine(); // Limpio el buffer del Scanner

        Libro libro = miBiblioteca.buscaLibro(idLibro);

        if (libro == null) {
            System.out.println("404 - Libro no encontrado");
        } else if (!libro.getDisponible()) {
            System.out.println("Libro no disponible");
        } else {
            System.out.println("¿Deseas sacar este libro? (s/n)");
            System.out.println(libro);

            String confirmacion = miScanner.nextLine();
            if (confirmacion.equals("s")) {
                miBiblioteca.prestarLibro(idLibro);
            }
        }
    }

    public static void devolverLibro() {
        System.out.println("Introduzca el id del libro:");
        int idLibro = miScanner.nextInt();
        miScanner.nextLine(); // Limpio el buffer del Scanner

        Libro libro = miBiblioteca.buscaLibro(idLibro);

        if (libro == null) {
            System.out.println("404 - Libro no encontrado");
        } else if (libro.getDisponible()) {
            System.out.println("No puedes devolver ese libro, ya está en la biblioteca.");
        } else {
            System.out.println("¿Deseas devolver este libro? (s/n)");
            System.out.println(libro);

            String confirmacion = miScanner.nextLine();
            if (confirmacion.equals("s")) {
                miBiblioteca.devolverLibro(idLibro);
            }
        }
    }
}
