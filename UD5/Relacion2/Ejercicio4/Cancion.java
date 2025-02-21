
public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    public Cancion(){
        titulo = "___";
        artista = "___";
        // duracion = 0;
    }

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }
    


    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + " | Artista: " + this.artista + " | Duración: " + this.duracion + '"';
    }

    public static void main(String[] args) {
        Cancion miCancionPorDefecto = new Cancion();
        System.out.println(miCancionPorDefecto);
        Cancion miCancion = new Cancion("Chicle de menta","Maria Daniela",186);
        System.out.println(miCancion);

        miCancionPorDefecto.setTitulo("titulo");
        System.out.println("El título de miCancionPorDefecto es: " + miCancionPorDefecto.getTitulo());
    }
}
