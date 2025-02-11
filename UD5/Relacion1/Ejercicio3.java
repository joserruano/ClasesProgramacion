class Alumno {
    String nombre;
    String materia;
    double calificacion;

    public Alumno(String nombre, String materia, double calificacion){
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }
    
    public boolean aprobado(){
        return (this.calificacion >= 6);
    }

    public String toString(){
        
        return "El alumno/a " + this.nombre + " ha sacado un " + this.calificacion + " en " + this.materia + " y ha " + (this.aprobado() ? "aprobado" : "suspendido") + ".";
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pepe", "Bases de datos", 7);
        Alumno alumno2 = new Alumno("María", "Filosofía", 4);

        System.out.println(alumno1);
        System.out.println(alumno2);
    }
}
