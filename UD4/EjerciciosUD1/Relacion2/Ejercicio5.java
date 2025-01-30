package EjerciciosUD1.Relacion2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numero;
        boolean estaEntre10y20;

        System.out.println("Introduzca un número: ");
        numero = miScanner.nextInt();

        estaEntre10y20 = (numero >= 10 && numero <= 20);

        if(estaEntre10y20){
            System.out.println("El número está entre 10 y 20");
        }else{
            System.out.println("El número no está entre 10 y 20");
        }

        miScanner.close();
    }

}
/* En JAVASCRIPT
 * 
 * let numero = prompt("Introduzca el numero")
 * numero = Number(numero)
 * 
 * let estaEntre10y20 = ( numero >= 10 && numero <= 20 )
 * 
 * if(estaEntre10y20){
 *      console.log("El número está entre 10 y 20")
 * }else{
 *      console.log("El número NO está entre 10 y 20")
 * }
 */
