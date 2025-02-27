public class Ejercicio5 {

    public static Cine kinepole = new Cine();
    public static final int CANTIDAD_PELICULAS = 5;

    public static void inicializarPeliculas(){
        for (int i = 0; i < CANTIDAD_PELICULAS; i++) {
            Pelicula aleatoria = new Pelicula(Faker.lorem(3),"Faker.loremLargo()",Faker.nombreCompleto(), Faker.entero(90, 400));
            kinepole.agregarPelicula(aleatoria);
        }
    }

    public static void main(String[] args) {
        inicializarPeliculas();

        Pelicula miPeli = new Pelicula("titulo", "sinopsis", "director", 33);

        kinepole.agregarPelicula(miPeli);

        miPeli.setTitulo("titulo nuevo");

        Pelicula buscada = kinepole.buscarPorTitulo("titulo nuevo");
        buscada.setTitulo("Titulo mas nuevo");

        Pelicula otraPeli = miPeli.clone();
        otraPeli.setTitulo("De locos ya esto");

        System.out.println(kinepole);
        System.out.println(otraPeli);

    }
}
