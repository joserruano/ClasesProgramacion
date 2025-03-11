public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String tipoCombustible, int numeroPuertas) {
        super(marca, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " y tiene " + numeroPuertas + " puertas";
    }
    
    
}
