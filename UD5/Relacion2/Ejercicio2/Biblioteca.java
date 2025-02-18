import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> fondo;

    public Biblioteca() {
        this.fondo = new ArrayList();
    }

    public void agregarLibro(Libro nuevoLibro) {
        int idNuevoLibro = fondo.size() + 1; // El tamaño del array + 1 es el id que le corresponde al nuevo libro
        nuevoLibro.setId(idNuevoLibro);
        fondo.add(nuevoLibro);
    }

    public Libro buscaLibro(int idLibro) {

        Libro encontrado = null;

        for (int i = 0; i < fondo.size() && encontrado == null; i++) {
            Libro libroActual = fondo.get(i);
            if (libroActual.getId() == idLibro) {
                encontrado = libroActual;
            }
        }

        return encontrado;

    }

    public void prestarLibro(int idLibro) {

        Libro prestamo = buscaLibro(idLibro);

        if (prestamo != null) {
            prestamo.setDisponible(false);
        }

    }

    public void devolverLibro(int idLibro) {
        Libro prestamo = buscaLibro(idLibro);

        if (prestamo != null) {
            prestamo.setDisponible(true);
        }
    }

    public String toString() {
        String stringListadoLibros = "Libros de la biblioteca:\n";

        for (Libro libro : fondo) {
            stringListadoLibros += libro + "\n";
        }

        return stringListadoLibros;
    }

}
