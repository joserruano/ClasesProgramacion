import java.util.Scanner;

import UD5.Relacion2.Faker;

public class Ejercicio3 {
    final static int CANTIDAD_PRODUCTOS = 100;
    final static String OPCION_SALIDA = "4";

    final static Scanner miScanner = new Scanner(System.in);
    private static Supermercado miSupermercado;
    public static void main(String[] args) {

        inicializarSupermercado();

        String opcion = "";
        while (!opcion.equals(OPCION_SALIDA)) {

            imprimirMenu();
            opcion = miScanner.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Insertar id:");
                int idProducto = Integer.parseInt(miScanner.nextLine());
                System.out.println("Insertar nombre:");
                String nombreProducto = miScanner.nextLine();
                System.out.println("Insertar descripción:");
                String descripcionProducto = miScanner.nextLine();
                System.out.println("Insertar precio:");
                double precioProducto = Double.parseDouble(miScanner.nextLine());
                System.out.println("Insertar stock:");
                int stockProducto = Integer.parseInt(miScanner.nextLine());
                Producto miProducto = new Producto(idProducto, nombreProducto, descripcionProducto, precioProducto, stockProducto);
                miSupermercado.agregarProducto(miProducto);
            } else if (opcion.equals("2")) {
                System.out.println("Insertar id:");
                int idProducto = Integer.parseInt(miScanner.nextLine());
                boolean vendido = miSupermercado.venderProducto(idProducto);
                System.out.println((vendido) ? "Vendido" : "No vendido" );
            } else if (opcion.equals("3")) {
                System.out.println("Inventario:");
                System.out.println(miSupermercado.mostrarInventario());
            }
        }

        /*
        // REPASO EJECUCIÓN Y COPIA ARRAYLIST

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        ArrayList<Integer> otraListaNumeros = new ArrayList<Integer>();

        for(int i = 0 ; i < 10 ; i++){
            listaNumeros.add(i);
        }

        System.out.println(listaNumeros);
        // No se hace una copia, se hace una referencia.
        otraListaNumeros = listaNumeros; 
        System.out.println(otraListaNumeros);

        System.out.println("-----------------------------");

        // Si modificas una, modificas las dos.
        listaNumeros.set(3,10);
        System.out.println(listaNumeros);
        System.out.println(otraListaNumeros);
        */
    }

    public static void inicializarSupermercado() {
        miSupermercado = new Supermercado();
        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            Producto aleatorio = new Producto(i+1,Faker.lorem(2), "descripicion", Faker.precio(1,100),Faker.entero(1,100));
            miSupermercado.agregarProducto(aleatorio);
        }
    }

    public static void imprimirMenu() {
        System.out.println(
                        "1. Agregar Producto.\n" +
                        "2. Vender Producto.\n" +
                        "3. Mostrar Inventario\n" +
                        "4. Salir");
    }
    
}
