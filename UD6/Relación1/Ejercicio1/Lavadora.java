public class Lavadora extends Electrodomestico {
    
    private double capacidadCarga;

    public Lavadora(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + " | Capacidad de Carga: " + this.capacidadCarga;
    }
    
}
