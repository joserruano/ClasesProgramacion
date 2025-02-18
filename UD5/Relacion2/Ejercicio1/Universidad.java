
import java.util.ArrayList;

public class Universidad {
    private ArrayList<Estudiante> listaEstudiantes;

    public Universidad() {
        this.listaEstudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiante(Estudiante nuevoEstudiante) {
        this.listaEstudiantes.add(nuevoEstudiante);
    }

    public Estudiante buscarEstudiante(int numeroMatricula) {
        Estudiante buscado = null;

        for (int i = 0; i < listaEstudiantes.size() && buscado == null; i++) {
            Estudiante estudianteActual = listaEstudiantes.get(i);

            if (estudianteActual.getNumeroMatricula() == numeroMatricula) {
                buscado = estudianteActual;
            }
        }

        return buscado;
    }

    public String toString() {
        String stringListadoEstudiantes = "Estudiantes de la universidad:\n";

        for (Estudiante estudiante : listaEstudiantes) {
            stringListadoEstudiantes += estudiante + "\n";
        }

        return stringListadoEstudiantes;
    }

}
