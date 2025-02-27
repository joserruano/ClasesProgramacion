public class Pelicula {
    String titulo;
    String sinopsis;
    String director;
    int duracion;

    public Pelicula(String titulo, String sinopsis, String director, int duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String toString() {
        return titulo + " | " + director + " | " + duracion + " minutos";
    }

    public Pelicula clone(){
        return new Pelicula(titulo, sinopsis, director, duracion);
    }

}
