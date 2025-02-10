package UD5.Ejemplos;

// 2º Modifica setPeso de forma que el peso solo pueda estar entre 0 y 60kg. En caso de introducir un peso fuera de rango, el peso será 0.

// 3º Modifica setEdad de forma que la edad solo pueda estar entre 0 y 20 años. En caso de introducir una edad fuera de rango, la edad será 0.

// 4º La raza debe almacenarse siempre en mayúscula. Una vez creado un perro, este no puede cambiar de raza.

public class MiPrimeritaClase {

    public static String hola() {
        return "Hola!!!!";
    }

    public static void main(String[] args) {

        // Persona javi = new Persona("Javi", 22, 70, 175);
        // Persona nobita = new Persona("Nobita", 12, 40, 155);
        // Persona doraemon = new Persona("Doraemon", -150, 400, 100);
        // Persona sizuka = new Persona("Sizuka", 12, 40, 150);

        // System.out.println(sizuka.calcularIMC());

        // ========================= PERROS ===================== //

        Perro toby = new Perro("Toby", "caniche", 3, 0.5);
        Perro elias = new Perro("Elías", "pastor belga", 7, 20);
        Perro chloe = new Perro("Chloè", "pomeranian", 10, 2);
        
        elias.setPeso(10);

        System.out.println(elias.getNombre() + " es de tamaño " + elias.getTamanio());
        System.out.println(elias.getNombre() + " ladra: " + elias.ladrar());

    }

}

class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String tamanio;
    

    public Perro(String nombre, String raza, int edad, double peso) {
        this.setNombre(nombre);
        this.raza = raza;
        this.edad = edad;
        this.setPeso(peso);
    }

    // =================== getters y setters =================== //

    private void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setTamanio(); // Si cambia el peso, quiero volver a calcular el tamaño
    }

    public double getPeso() {
        return this.peso;
    }

    private void setTamanio() {

        if (this.peso < 5) {
            this.tamanio = "PEQUEÑO";       
        }else if(this.peso<=10){
            this.tamanio = "MEDIANO";
        }else{
            this.tamanio = "GRANDE";
        }

    }

    public String getTamanio() {
        return this.tamanio;
    }

    // =================== Mis métodos =================== //
    public int calcularEdadHumana() {
        return this.edad * 7;
    }

    public String ladrar() {

        String ladrido = "";

        if (tamanio != null) {
            if (tamanio.equals("PEQUEÑO")) {
                ladrido = "wi wi wi";
            } else if (tamanio.equals("MEDIANO")) {
                ladrido = "wau wau wau";
            } else if (tamanio.equals("GRANDE")) {
                ladrido = "wof wof wof";
            }
        }

        return ladrido;
    }

}

class Persona {

    // Atributos de la clase
    public String nombre;
    public int edad;
    public double peso;
    public double estatura;
    public final int ANIO_ACTUAL = 2025;

    // Constructor de la clase -> instrucciones para crear el objeto
    public Persona(String nombre, int edad, double peso, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public int calcularAnioNacimiento() {
        return ANIO_ACTUAL - this.edad;
    }

    public boolean esMayorDeEdad() {
        return (this.edad >= 18);
    }

    public double calcularIMC() {
        double estaturaMetros = this.estatura / 100;
        return this.peso / (estaturaMetros * estaturaMetros);
    }

    public String saludar() {
        return "Hola " + nombre;
    }

    // static significa que este método puede ser usado sin instanciar un objeto de
    // la clase
    public static String hola() {
        return "Hola Persona!!!!";
    }

}
