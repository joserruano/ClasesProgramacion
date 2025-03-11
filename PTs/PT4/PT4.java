
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PT4 {

    static final String arrayFuego[] = {"aries","leo","sagitario"};
    static final ArrayList<String> listaFuego = new ArrayList<String>(Arrays.asList(arrayFuego)); 
    
    static final String arrayTierra[] = {"tauro","virgo","capricornio"};
    static final ArrayList<String> listaTierra = new ArrayList<String>(Arrays.asList(arrayTierra)); 
    
    static final String arrayAire[] = {"geminis","libra","acuario"};
    static final ArrayList<String> listaAire = new ArrayList<String>(Arrays.asList(arrayAire)); 
    
    static final String arrayAgua[] = {"cancer","escorpio","piscis"};
    static final ArrayList<String> listaAgua = new ArrayList<String>(Arrays.asList(arrayAgua)); 
    
    static final String arraySignos[] = {"aries","leo","sagitario","tauro","virgo","capricornio","geminis","libra","acuario", "cancer","escorpio","piscis"};
    static final ArrayList<String> listaSignos = new ArrayList<String>(Arrays.asList(arraySignos)); 

    public static void main(String[] args) {
        
        Scanner miScanner = new Scanner(System.in);

        String nombre1;
        String nombre2;
        String signo1 = "";
        String signo2 = "";
        String elemento1;
        String elemento2;

        System.out.println("Nombre 1: ");
        nombre1 = miScanner.nextLine();
        System.out.println("Nombre 2: ");
        nombre2 = miScanner.nextLine();


        while (!listaSignos.contains(signo1)){
            System.out.println("Signo 1: ");
            signo1 = miScanner.nextLine().toLowerCase();
        }
        while (!listaSignos.contains(signo2)){
            System.out.println("Signo 2: ");
            signo2 = miScanner.nextLine().toLowerCase();
        }

        elemento1 = obtenerElemento(signo1);
        elemento2 = obtenerElemento(signo2);

        // TODO
        if (sonCompatibles(elemento1, elemento2)){
            System.out.println("Imprimir frase compatible.");
        } else if (sonIncompatibles(elemento1, elemento2)){
            System.out.println("Imprimir frase incompatible.");
        } else {
            System.out.println("Imprimir frase neutra.");
        }

    }

    public static String obtenerElemento(String signo){
        String elemento = "";

        if (signo.equals("aries") || signo.equals("leo") || signo.equals("sagitario") )
            elemento = "fuego";
        else if (listaTierra.contains(signo))
            elemento = "tierra";
        else if (listaAire.contains(signo))
            elemento = "aire";
        else
            elemento = "agua";

        return elemento;
    }

    public static boolean sonCompatibles(String elemento1, String elemento2){
        return
        elemento1.equals("fuego") && elemento2.equals("aire") ||
        elemento1.equals("tierra") && elemento2.equals("agua") ||
        elemento1.equals("aire") && elemento2.equals("fuego") ||
        elemento1.equals("agua") && elemento2.equals("tierra");
    }
    public static boolean sonIncompatibles(String elemento1, String elemento2){
        return
        elemento1.equals("fuego") && elemento2.equals("agua") ||
        elemento1.equals("tierra") && elemento2.equals("aire") ||
        elemento1.equals("aire") && elemento2.equals("tierra") ||
        elemento1.equals("agua") && elemento2.equals("fuego");
    }

}
