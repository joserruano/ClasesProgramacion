public class Electrodomestico {
    protected String marca;
    protected String modelo;

    public Electrodomestico(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "Marca: " + this.marca + " | Modelo: " + this.modelo;
    }

}
