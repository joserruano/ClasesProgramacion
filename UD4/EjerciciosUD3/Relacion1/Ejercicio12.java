
import java.util.ArrayList;

// 12. Simular un Lanzamiento de Moneda hasta Obtener 3 "Caras"
// Escribe una función simularLanzamientoHastaTresCaras que simule el lanzamiento de una moneda (cara o cruz) hasta que obtenga 3 veces "Cara" de forma seguida. Devuelve cuántos lanzamientos se necesitaron para llegar a tener 3 "Caras" y el array con todos los lanzamientos.

public class Ejercicio12 {
    static final int carasSeguidasBuscadas = 3;

    public static void main(String[] args) {
        ArrayList<String> registroLanzamientos = new ArrayList<>();
        int carasSeguidasLanzadas = 0;

        while (carasSeguidasLanzadas != carasSeguidasBuscadas) {
            String moneda = lanzarMoneda();
            registroLanzamientos.add(moneda);

            if(moneda.equals("CARA")){
                carasSeguidasLanzadas++;
            }else{
                carasSeguidasLanzadas = 0;
            }
        }

        System.out.println(registroLanzamientos.size());
        System.out.println(registroLanzamientos);

    }

    public static String lanzarMoneda(){
        int lanzamiento = numeroAleatorio(0, 1);
        return (lanzamiento == 0 ? "CARA" : "CRUZ"); // Operador ternario
    }

    // public static String lanzarMoneda(){
    //     String moneda[] = {"CARA", "CRUZ"};
    //     int lanzamiento = numeroAleatorio(0, 1);

    //     return moneda[lanzamiento];
    // }

    // public static String lanzarMoneda(){
    //     String resultado;
    //     int lanzamiento = numeroAleatorio(0, 1);

    //     if(lanzamiento == 0){
    //         resultado = "CARA";
    //     }else{
    //         resultado = "CRUZ";
    //     }

    //     return resultado;
    // }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

}
