// Crea una clase Empleado con los atributos nombre y sueldoBase. Luego, crea tres subclases: Programador, Diseñador y Gerente. Cada subclase debe tener un método calcularSueldo() que ajuste el sueldo base según un bonificador específico para cada tipo de empleado.

// Implementa una clase Main para probar la creación de objetos y la llamada al método calcularSueldo().

public class Main{
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Federico", 15000);
        Programador programador = new Programador("Giménez", 18000);
        Diseniador diseniador = new Diseniador("Los santos", 16000, 1.2);
        Gerente gerente = new Gerente("Domingo", 20000);

        System.out.println(empleado);
        System.out.println(programador);
        System.out.println(diseniador);
        System.out.println(gerente);

        programador.setSueldoBase(19000);

        System.out.println();
        System.out.println(programador);

    }
}