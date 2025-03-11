public class Gerente extends Empleado {

    private final double BONIFICADOR = 3;

    public Gerente(String nombre, double sueldoBase) {
        this.setNombre(nombre);
        this.setSueldoBase(sueldoBase);
    }

    @Override
    public void setSueldoBase(double sueldoBase) {
        super.setSueldoBase(sueldoBase * BONIFICADOR);
    }

}
