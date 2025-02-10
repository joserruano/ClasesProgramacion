
class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void ingresar(double cantidad){
        double cantidadIngresar = valorAbsoluto(cantidad);
        this.saldo += cantidadIngresar;
    }

    public void retirar(double cantidad){
        double cantidadRetirar = valorAbsoluto(cantidad);
        if(this.saldo > cantidadRetirar){
            this.saldo -= cantidadRetirar;
        }
    }

    public double valorAbsoluto(double numero){
        return numero < 0 ? numero * -1 : numero;
    }


}

public class Ejercicio2 {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Rosalía", 15000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Victoria", 1000000);

        cuenta1.ingresar(-5);
        cuenta2.retirar(900000);

        System.out.println(cuenta1.getTitular() + " tiene " + cuenta1.getSaldo()+"€");
        System.out.println(cuenta2.getTitular() + " tiene " + cuenta2.getSaldo()+"€");
    }
}
