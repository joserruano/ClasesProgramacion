class Termometro {
    double temperatura;

    public Termometro(double temperatura){
        this.setTemperatura(temperatura);
    }

    public double getTemperatura(){
        return this.temperatura;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    public double convertirFarenheit(){
        return this.temperatura * 9/5 + 32;
    }

    public String toString(){
        return this.temperatura + "ºC - " + this.convertirFarenheit() + "ºF";
    }
    
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Termometro termometro1 = new Termometro(2);
        
        System.out.println(termometro1);

        termometro1.setTemperatura(30);

        System.out.println(termometro1);
    }
}
