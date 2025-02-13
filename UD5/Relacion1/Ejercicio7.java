class Lampara {
    boolean estado;

    public Lampara() {
        this.estado = false;
    }

    public Lampara(boolean estado) {
        this.estado = estado;
    }

    public void interruptor() {
        this.estado = (this.estado ? false : true);

        // if(this.estado == true){
        // this.estado = false;
        // }else{
        // this.estado = true;
        // }
    }

    // public void encender(){
    // this.estado=true;
    // }

    // public void apagar(){
    // this.estado=false;
    // }

    public String toString() {
        return "La lámpara está " + (this.estado ? "encendida" : "apagada") + ".";
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Lampara lampara1 = new Lampara();

        System.out.println(lampara1);

        lampara1.interruptor();

        System.out.println(lampara1);
    }
}
