public class Vehiculo {
    private String marca;
    private String tipoCombustible;

    public Vehiculo(String marca, String tipoCombustible) {
        this.marca = marca;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "El vehiculo de marca " + marca + " consume " + tipoCombustible;
    }

    
    
}
