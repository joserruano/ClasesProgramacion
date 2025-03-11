public class Diseniador extends Empleado{
    private double bonificador;

    public Diseniador(String nombre, double sueldoBase, double bonificador) {
        this.bonificador = bonificador;
        this.setNombre(nombre);
        this.setSueldoBase(sueldoBase);
    }

    @Override
    public void setSueldoBase(double sueldoBase) {
        super.setSueldoBase(sueldoBase * this.bonificador);
    }

    public double getBonificador() {
        return bonificador;
    }

    public void setBonificador(double bonificador) {
        this.bonificador = bonificador;
    }
    
}
