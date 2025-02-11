// 1º que en toString() salgan 0s cuando la hora, el minuto o el segundo sea menor que 10
// 2º las horas deben ser 0 - 23 y los minutos y segundos de 0 - 59
// 3º completa el método setReloj()

class Reloj {
    int hora;
    int minuto;
    int segundo;

    public Reloj(String hora) {
        this.setReloj(hora);
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setReloj(String hora) { // "03:24:54"
        // TO-DO
    }

    public String toString() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

}

public class Ejercicio6 {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(4, 05, 320);
        Reloj reloj2 = new Reloj("03:24:54");

        System.out.println(reloj1);
        System.out.println(reloj2);
    }
}
