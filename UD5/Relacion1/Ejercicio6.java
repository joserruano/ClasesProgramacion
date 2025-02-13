
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
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setReloj(String tiempo) { // "03:24:54"

        String segmentos[] = tiempo.split(":");

        int hora = Integer.parseInt(segmentos[0]);
        int minuto = Integer.parseInt(segmentos[1]);
        int segundo = Integer.parseInt(segmentos[2]);

        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora){
        if(hora >=0 && hora <=23){
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto){
        if(minuto >=0 && minuto <=59){
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo){
        if(segundo >=0 && segundo <=59){
            this.segundo = segundo;
        }
    }

    public String toString() {
        return (this.hora    < 10 ? "0"+this.hora    : this.hora) + ":" 
             + (this.minuto  < 10 ? "0"+this.minuto  : this.minuto) + ":" 
             + (this.segundo < 10 ? "0"+this.segundo : this.segundo);
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
