
import java.util.ArrayList;

public class PlayList {
    ArrayList<Cancion> listaReproduccion;

    public PlayList() {
        listaReproduccion = new ArrayList<>();
    }

    public void aniadirCancion(Cancion nuevaCancion){
        this.listaReproduccion.add(nuevaCancion);
    }

    public int duracionTotal(){
        int duracionTotal = 0;

        for (Cancion cancion : listaReproduccion) {
            duracionTotal += cancion.getDuracion();
        }

        return duracionTotal;
    }

    public String toString() {
        String string = "Canciones en esta lista:\n";
        
        for (Cancion cancion : listaReproduccion) {
            string += cancion + "\n";
        }

        return string;
    }
        
}
