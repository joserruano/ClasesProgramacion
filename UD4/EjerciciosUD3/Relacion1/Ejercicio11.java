
import java.lang.classfile.Opcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 11. Simular un Juego de Piedra, Papel o Tijeras
// Crea una función juegoPiedraPapelTijeras que genere aleatoriamente una elección entre "Piedra", "Papel" o "Tijeras" y permite al usuario jugar contra la máquina.

public class Ejercicio11 {

    static final String arrayOpciones[] = { "PIEDRA", "PAPEL", "TIJERA" };
    static final ArrayList<String> opciones = new ArrayList<>(Arrays.asList(arrayOpciones));

    static final int rondas = 5;
    static final int minimoParaGanar = rondas / 2 + 1;

    static int vecesGanaUsuario = 0;
    static int vecesGanaMaquina = 0;

    static final Scanner miScanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (vecesGanaUsuario != minimoParaGanar && vecesGanaMaquina != minimoParaGanar) {
            String opcionMaquina = resultadoMaquina();
            String opcionUsuario = solicitarOpcionUsuario();

            String resultadoJuego = comprobarJuego(opcionUsuario, opcionMaquina);

            System.out.println(opcionUsuario + " contra " + opcionMaquina + " : " + resultadoJuego);
            System.out.println("Usuario: " + vecesGanaUsuario + " - Maquina: " + vecesGanaMaquina);
        }

    }

    public static String solicitarOpcionUsuario() {
        String opcionUsuario = "";

        while (!opciones.contains(opcionUsuario)) {
            System.out.println("¿Piedra, Papel o Tijera?");
            opcionUsuario = miScanner.nextLine().toUpperCase();
        }

        return opcionUsuario;
    }

    public static String resultadoMaquina() {
        int posicionAleatoria = numeroAleatorio(0, opciones.size() - 1);
        return opciones.get(posicionAleatoria);
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static String comprobarJuego(String opcionUsuario, String opcionMaquina) {
        String resultado;

        boolean ganaUsuario = (opcionUsuario.equals("PIEDRA") && opcionMaquina.equals("TIJERA")) ||
                (opcionUsuario.equals("PAPEL") && opcionMaquina.equals("PIEDRA")) ||
                (opcionUsuario.equals("TIJERA") && opcionMaquina.equals("PAPEL"));

        if (opcionUsuario.equals(opcionMaquina)) {
            resultado = "EMPATAS";
        } else if (ganaUsuario) {
            resultado = "GANAS";
            vecesGanaUsuario++;
        } else {
            resultado = "PIERDES";
            vecesGanaMaquina++;
        }

        return resultado;
    }
}
