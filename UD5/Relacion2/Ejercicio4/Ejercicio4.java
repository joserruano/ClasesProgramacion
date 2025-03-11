
import java.util.Scanner;

import UD5.Relacion2.Faker;

public class Ejercicio4 {

    public static PlayList misCanciones = new PlayList();
    public static final int CANTIDAD_CANCIONES = 100;
    public static final String SALIDA = "4";
    public static final Scanner miScanner = new Scanner(System.in);

    public static void inicializarPlayList(){
        for (int i = 0; i < CANTIDAD_CANCIONES; i++) {
            Cancion aleatoria = new Cancion(Faker.lorem(3), Faker.nombreCompleto(), Faker.entero(180, 240));
            misCanciones.aniadirCancion(aleatoria);
        }
    }

    public static void imprimirMenu(){
        System.out.println(
            "1. Añadir canción.\n"+
            "2. Mostrar canciones\n"+
            "3. Ver duración de la playlist.\n"+
            "4. Salir."
        );
    }

    public static void agregarCancion(){
        System.out.println("Introduzca el nombre de la canción");
        String nombre = miScanner.nextLine();

        System.out.println("Introduzca el nombre del artista");
        String artista = miScanner.nextLine();

        System.out.println("Introduzca la duración en segundos");
        int duracion = miScanner.nextInt();
        miScanner.nextLine();

        Cancion nuevaCancion = new Cancion(nombre, artista, duracion);
        misCanciones.aniadirCancion(nuevaCancion);
    }

    public static void main(String[] args) {
        inicializarPlayList();
        String opcion = "";

        while (!opcion.equals(SALIDA)){

            imprimirMenu();
            opcion = miScanner.nextLine();

            if(opcion.equals("1")){
                agregarCancion();
            }else if(opcion.equals("2")){
                System.out.println(misCanciones);
            }else if (opcion.equals("3")){
                System.out.println("La playslist dura " + misCanciones.duracionTotal() + " segundos");
            }
        }

    }
    
}
