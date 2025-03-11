public class Programador extends Empleado {

    private final double BONIFICADOR = 1.5;

    public Programador(String nombre, double sueldoBase) {
        this.setNombre(nombre);
        this.setSueldoBase(sueldoBase);
    }

    @Override
    public void setSueldoBase(double sueldoBase) {
        super.setSueldoBase(sueldoBase * BONIFICADOR);
    }

}
