class EjemploAnimales {
    public static void main(String[] args) {
        Animal nuevoAnimal = new Animal("Animalico", 7);

        Perro nuevoPerro = new Perro("Perrito", 8, "wof wof");

        System.out.println(nuevoAnimal);
        System.out.println(nuevoPerro);
        System.out.println(nuevoPerro.ladrar());
    }
}

class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Animal: " + nombre + " | Edad: " + edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

class Perro extends Animal {

    private String ladrido;

    public Perro(String nombre, int edad, String ladrido) {
        super(nombre, edad); // Nombre y edad son atributos de la clase padre, llamo al constructor de Animal
                             // con super()
        this.ladrido = ladrido;
    }

    public String ladrar() {
        return this.getNombre() + " ladra así: " + this.ladrido;
    }

    @Override // Indico que estoy sobreescribiendo un método de la clase padre
    public String toString() {
        return super.toString() + " | Ladrido: " + this.ladrido;
    }

}
