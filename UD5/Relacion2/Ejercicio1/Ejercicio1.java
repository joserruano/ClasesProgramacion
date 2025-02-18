public class Ejercicio1 {
    public static void main(String[] args) {
        final int CANTIDAD_ALUMNOS = 100;

        Estudiante jose = new Estudiante("Jose Pedro", 38, 1258);
        Estudiante sara = new Estudiante("Sara María", 28, 1385);
        Estudiante josefa = new Estudiante("Josefa Ramira", 68, 17);

        Universidad laRioja = new Universidad();

        laRioja.agregarEstudiante(jose);
        laRioja.agregarEstudiante(sara);
        laRioja.agregarEstudiante(josefa);

        // System.out.println(laRioja);

        // System.out.println(laRioja.buscarEstudiante(17));

        for (int i = 0; i < CANTIDAD_ALUMNOS; i++) {
            Estudiante aleatorio = new Estudiante(Faker.nombre(), Faker.edad() , i);
            laRioja.agregarEstudiante(aleatorio);
        }

        System.out.println(laRioja);

    }
}
