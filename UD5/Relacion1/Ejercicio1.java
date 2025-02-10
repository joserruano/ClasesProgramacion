
class Circulo {

    private final double PI = 3.1415;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * this.radio * this.radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }

    public double getRadio() {
        return this.radio;
    }
}

public class Ejercicio1 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(1);

        System.out.println("Círculo de radio " + circulo1.getRadio() + " Area: " + circulo1.calcularArea() + " Perímetro: " + circulo1.calcularPerimetro());
        System.out.println("Círculo de radio " + circulo2.getRadio() + " Area: " + circulo2.calcularArea() + " Perímetro: " + circulo2.calcularPerimetro());
    }

}
