
import java.util.ArrayList;

public class Cine {
    ArrayList <Pelicula> cartelera;

    public Cine() {
        this.cartelera = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula nuevPelicula){
        this.cartelera.add(nuevPelicula);
    }

    public double duracionMedia(){
        double duracionTotal = 0;

        for (Pelicula pelicula : cartelera) {
            duracionTotal+=pelicula.getDuracion();
        }

        return duracionTotal/cartelera.size();
    }

    public Pelicula buscarPorTitulo(String titulo){

        Pelicula buscada = null;

        for (int i = 0; i < cartelera.size() && buscada == null; i++) {
            Pelicula peliculaActual = cartelera.get(i);

            if(peliculaActual.getTitulo().equals(titulo)){
                buscada = peliculaActual;
            }
        }

        return buscada;
    }

    public String toString() {
        String string = "Películas en cartelera:\n";

        for (Pelicula pelicula : cartelera) {
            string += pelicula + "\n";
        }

        return string;
    }

}
