// Crea una clase Vehiculo con los atributos marca y tipoCombustible. Luego, crea dos subclases: Coche con el atributo numeroPuertas y Moto con el atributo cilindrada.
// Implementa el método toString() en cada subclase para que devuelva una cadena con los detalles del vehículo.
// Implementa una clase Main para probar la creación de objetos y la llamada al método toString().

public class Main {
    public static void main(String[] args) {
        Vehiculo camion = new Vehiculo("Mercedes", "Diesel");
        Coche coche = new Coche("Ford", "Gasolina", 3);
        Moto moto = new Moto("Yamaha", "Gasolina", 125);

        System.out.println(camion);
        System.out.println(coche);
        System.out.println(moto);
    }
}
