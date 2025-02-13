
class Televisor {
    String canalActual;
    int volumen;

    public Televisor() {
        this.canalActual = "";
        setVolumen(0);
    }

    public Televisor(String canalActual, int volumen) {
        this.canalActual = canalActual;
        setVolumen(volumen);
    }

    public void setCanal(String canalActual) {
        this.canalActual = canalActual;
    }

    private void setVolumen(int volumen) {
        if (volumen > 100) {
            this.volumen = 100;
        } else if (volumen < 0) {
            this.volumen = 0;
        } else {
            this.volumen = volumen;
        }
    }

    public void subirVolumen() {
        setVolumen(this.volumen+1);
    }

    public void bajarVolumen() {
        setVolumen(this.volumen-1);
    }

    public String toString() {
        return "Canal: " + this.canalActual + " | Volumen: " + this.volumen;
    }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        Televisor tele1 = new Televisor();
        Televisor tele2 = new Televisor("LA PRIMERA", 600);

        tele1.setCanal("INTERECONOMIA");
        tele1.subirVolumen();

        System.out.println(tele1);
        System.out.println(tele2);
    }
}
