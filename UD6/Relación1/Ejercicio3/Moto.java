public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String tipoCombustible, int cilindrada) {
        super(marca, tipoCombustible);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "La moto de marca " + this.getMarca() + " consume " + this.getTipoCombustible() + " y tiene una cilindrada de " + this.cilindrada + "cc";
    }

}
