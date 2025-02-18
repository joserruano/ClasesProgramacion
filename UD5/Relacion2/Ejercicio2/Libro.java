public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, String sinopsis) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.disponible = true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public String toString() {
        return id + " | " + titulo + " | " + autor + " | " + sinopsis + " | "
                + (disponible ? "DISPONIBLE" : "NO DISPONIBLE");
    }

}
