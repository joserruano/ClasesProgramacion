class Auto{
    String marca;
    String modelo;
    int velocidadActual;

    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar(int cantidad){
        this.velocidadActual += cantidad;
    }

    public void frenar(int cantidad){
        if(cantidad > this.velocidadActual){
            this.velocidadActual = 0;
        }else{
            this.velocidadActual -= cantidad;
        }

        // this.velocidadActual -= (cantidad > this.velocidadActual) ? this.velocidadActual : cantidad;

        // this.velocidadActual = (cantidad > this.velocidadActual) ? 0 : this.velocidadActual-cantidad;

    }

    public String toString() {
        return "El auto " + this.marca + " " + this.modelo + " viaja a " + this.velocidadActual+ "km/h.";
    }

}

public class Ejercicio4 {
    public static void main(String[] args) {
        Auto coche = new Auto("volkswagen", "golf");
        Auto tractor = new Auto("Jhon dere", "muy guapo");

        coche.acelerar(100);
        coche.frenar(55);

        tractor.acelerar(20);
        tractor.frenar(40);

        System.out.println(coche);
        System.out.println(tractor);
    }
}
