# Unidad Didáctica 5: Programación en Java

## 1. Introducción  
En esta unidad se explorarán los fundamentos de la programación en Java utilizando únicamente clases básicas (sin herencia, interfaces ni clases abstractas). Se trabajará en la sintaxis y estructura de las clases, la creación y manipulación de objetos, el uso de métodos y constructores, así como el manejo de variables y modificadores de acceso.  

Además, se profundizará en el uso de **getters**, **setters** y el método **toString()** para mejorar la gestión de datos y la depuración. Finalmente, se presentarán los principios básicos de la **Programación Orientada a Objetos (POO)**, con especial énfasis en **encapsulamiento** y **abstracción**.  

---

## 2. Clases y Objetos

En la programación orientada a objetos (POO), los conceptos de **clase** y **objeto** son fundamentales. Java, al ser un lenguaje basado en POO, permite la creación y manipulación de objetos a partir de clases, lo que facilita la organización del código y su reutilización.  

Las clases sirven como **plantillas o modelos** a partir de los cuales se crean objetos con características y comportamientos específicos. Un objeto es una **instancia de una clase**, lo que significa que es una representación concreta con valores asignados a sus atributos.  

### 2.1 Concepto de Clase y Objeto  

#### ¿Qué es una Clase?  
Una **clase** es una estructura que define un conjunto de **atributos** (propiedades o características) y **métodos** (acciones o comportamientos) que compartirán todos los objetos creados a partir de ella.  

Se puede pensar en una clase como un **molde o plano** que describe cómo deben ser los objetos que se creen a partir de ella.  

#### Ejemplo cotidiano de una Clase  
Imagina que una clase es el plano de construcción de una casa. El plano describe las características que tendrá la casa, como el número de habitaciones, el color de las paredes y el tipo de techo. Sin embargo, el plano en sí mismo no es una casa; es solo una representación de cómo debería ser una casa.  

Cuando se construyen casas reales a partir de ese plano, cada una de ellas es una **instancia del plano**. Es decir, cada casa creada siguiendo ese plano es un **objeto** basado en la clase.  

#### ¿Qué es un Objeto?  
Un **objeto** es una entidad concreta creada a partir de una clase. Cada objeto tiene su propio estado (valores de los atributos) y puede ejecutar acciones a través de los métodos definidos en la clase.  

Cada objeto es **independiente**, lo que significa que los valores de sus atributos pueden ser diferentes de los de otros objetos de la misma clase.  

### 2.2 Estructura Básica de una Clase en Java  

En Java, una clase se define utilizando la palabra clave `class`, seguida del nombre de la clase y un bloque de código delimitado por llaves `{}`.  

Una clase generalmente contiene:  
1. **Atributos**: Variables que representan las propiedades del objeto.  
2. **Métodos**: Funciones dentro de la clase que definen su comportamiento.  

#### Ejemplo de una Clase en Java  
```java
class Persona {
    // Atributos de la clase Persona
    String nombre;
    int edad;

    // Método para mostrar la información de la persona
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
```
##### Explicación del código:  
- La clase `Persona` representa a una persona con dos atributos: `nombre` (de tipo `String`) y `edad` (de tipo `int`).  
- La clase también tiene un método llamado `mostrarInformacion()`, que imprime en pantalla los valores de los atributos `nombre` y `edad`.  

### 2.3 Creación de Objetos en Java  

Para utilizar una clase en Java, se deben **crear objetos** a partir de ella. La creación de un objeto se conoce como **instanciación**, y se realiza utilizando la palabra clave `new`.  

El proceso de creación de un objeto involucra tres pasos:  
1. **Declaración**: Se declara una variable del tipo de la clase.  
2. **Instanciación**: Se usa la palabra clave `new` para asignar memoria al objeto.  
3. **Inicialización**: Se asignan valores a los atributos del objeto.  

#### Ejemplo de Creación de un Objeto en Java  
```java
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Persona
        Persona persona1 = new Persona();

        // Asignación de valores a los atributos del objeto
        persona1.nombre = "Carlos";
        persona1.edad = 25;

        // Llamada al método para mostrar la información
        persona1.mostrarInformacion();
    }
}
```

##### Explicación del código:  
1. **`Persona persona1 = new Persona();`** → Se crea un objeto llamado `persona1` de la clase `Persona`.  
2. **`persona1.nombre = "Carlos";`** → Se asigna el valor `"Carlos"` al atributo `nombre` del objeto `persona1`.  
3. **`persona1.edad = 25;`** → Se asigna el valor `25` al atributo `edad` del objeto `persona1`.  
4. **`persona1.mostrarInformacion();`** → Se llama al método `mostrarInformacion()`, que imprime los valores de `nombre` y `edad`.  

### 2.4 Importancia de las Clases y Objetos  

El uso de clases y objetos en Java ofrece múltiples ventajas:  

✔ **Modularidad:** El código se divide en unidades independientes, lo que facilita su mantenimiento y reutilización.  
✔ **Reutilización de código:** Se pueden crear múltiples objetos a partir de una sola clase, sin necesidad de escribir código repetitivo.  
✔ **Facilidad de mantenimiento:** Si es necesario modificar la funcionalidad de una clase, se hace en un solo lugar y afecta a todos los objetos creados a partir de ella.  
✔ **Organización estructurada:** Java permite modelar problemas del mundo real de manera intuitiva y estructurada.  

---

## 3. Métodos y Constructores

En Java, una clase no solo define atributos (datos) sino también **comportamientos** mediante los **métodos**. Los métodos permiten realizar operaciones, modificar atributos y ejecutar acciones en los objetos.  

Además, para inicializar objetos de manera eficiente y garantizar que tengan valores iniciales adecuados, Java proporciona los **constructores**, que son métodos especiales que se ejecutan automáticamente cuando se crea un objeto.  

### 3.1 Métodos en Java

#### ¿Qué es un Método?  
Un **método** en Java es un bloque de código que pertenece a una clase y que realiza una tarea específica. Un método puede recibir **parámetros**, ejecutar una serie de instrucciones y opcionalmente devolver un valor como resultado.  

Los métodos permiten reutilizar código y dividir programas en partes más manejables, promoviendo la modularidad.  

#### Estructura de un Método  
Un método en Java sigue esta estructura:  
```java
tipo_de_retorno nombreDelMetodo(parámetros) {
    // Cuerpo del método con instrucciones
    return valor;  // Si el método devuelve un valor
}
```

#### Ejemplo de un Método en Java  
```java
class Calculadora {
    // Método para sumar dos números y devolver el resultado
    int sumar(int a, int b) {
        return a + b;
    }
}
```

##### Explicación del código:
1. **`int sumar(int a, int b)`** → Se declara un método llamado `sumar` que recibe dos parámetros enteros (`a` y `b`).  
2. **`return a + b;`** → El método devuelve la suma de los dos números.  

Este método se puede utilizar en un programa de la siguiente manera:  
```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 7);
        System.out.println("Resultado de la suma: " + resultado);
    }
}
```

##### Salida del programa:
```
Resultado de la suma: 12
```

### 3.2 Tipos de Métodos en Java  

Java admite distintos tipos de métodos según su funcionalidad:  

#### 1. Métodos sin Retorno (`void`)  
Estos métodos ejecutan una acción pero no devuelven un valor.  
```java
class Mensaje {
    void mostrarMensaje() {
        System.out.println("¡Hola, bienvenido a Java!");
    }
}
```

Uso en un programa:  
```java
public class Main {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarMensaje();
    }
}
```
**Salida:**
```
¡Hola, bienvenido a Java!
```

#### 2. Métodos con Retorno  
Devuelven un valor de un tipo específico (`int`, `double`, `String`, etc.).  
```java
class Calculadora {
    int multiplicar(int a, int b) {
        return a * b;
    }
}
```

Uso en un programa:  
```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(4, 3);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
```
**Salida:**
```
El resultado de la multiplicación es: 12
```

#### 3. Métodos con Parámetros  
Los métodos pueden recibir valores como entrada para realizar cálculos o manipular datos.  

Ejemplo:  
```java
class Saludador {
    void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }
}
```

Uso en un programa:  
```java
public class Main {
    public static void main(String[] args) {
        Saludador s = new Saludador();
        s.saludar("Ana");
    }
}
```
**Salida:**
```
¡Hola, Ana!
```

### 3.3 Constructores en Java  

#### ¿Qué es un Constructor?  
Un **constructor** es un método especial de una clase que se ejecuta automáticamente cuando se crea un objeto. Su propósito es inicializar los atributos del objeto.  

#### Características de los Constructores:  
- Tienen el **mismo nombre** que la clase.  
- No tienen un **tipo de retorno** (ni siquiera `void`).  
- Se ejecutan **automáticamente** al instanciar un objeto.  

#### Ejemplo de un Constructor en Java  
```java
class Persona {
    String nombre;
    int edad;

    // Constructor
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
```

##### Explicación del código:
1. **`Persona(String nombre, int edad)`** → Constructor que recibe `nombre` y `edad` como parámetros.  
2. **`this.nombre = nombre;`** → Se asigna el valor del parámetro `nombre` al atributo `nombre` del objeto.  
3. **`this.edad = edad;`** → Se asigna el valor del parámetro `edad` al atributo `edad` del objeto.  

### 3.4 Uso del Constructor  

Para utilizar un constructor, se crea un objeto de la clase y se pasan los valores requeridos.  

```java
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto usando el constructor
        Persona persona1 = new Persona("Ana", 30);
        persona1.mostrarInformacion();
    }
}
```

##### Salida del programa:
```
Nombre: Ana, Edad: 30
```

### 3.5 Tipos de Constructores en Java  

#### 1. Constructor Predeterminado (por Defecto)  
Si una clase no define un constructor, Java proporciona uno automáticamente, que no recibe parámetros y no inicializa atributos.  

Ejemplo:  
```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
```
En este caso, Java proporciona un constructor predeterminado automáticamente.

#### 2. Constructor con Parámetros  
Se usa para inicializar los atributos de un objeto con valores específicos al momento de su creación.  

Ejemplo:  
```java
class Coche {
    String marca;
    int modelo;

    // Constructor con parámetros
    Coche(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void mostrarInformacion() {
        System.out.println("Coche: " + marca + ", Modelo: " + modelo);
    }
}
```

Uso en un programa:  
```java
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", 2022);
        coche1.mostrarInformacion();
    }
}
```

**Salida:**
```
Coche: Toyota, Modelo: 2022
```

### 3.6 Diferencias entre Métodos y Constructores  

| Característica   | Métodos | Constructores |
|-----------------|---------|--------------|
| **Nombre** | Puede ser cualquier nombre | Siempre tiene el nombre de la clase |
| **Retorno** | Puede devolver un valor o ser `void` | No tiene retorno |
| **Llamado** | Se llama explícitamente en el código | Se ejecuta automáticamente al crear un objeto |
| **Propósito** | Ejecutar acciones o cálculos | Inicializar un objeto |

---

## 4. Variables y Modificadores de Acceso

Las variables en Java son espacios de memoria reservados para almacenar datos y pueden tener diferentes ámbitos, características y niveles de acceso.  

Java ofrece una serie de modificadores que determinan cómo se pueden acceder y utilizar estas variables dentro de un programa. También proporciona las palabras clave `static` y `final` para definir variables con propiedades especiales que afectan su comportamiento dentro de una clase.  

### 4.1 Tipos de Variables en Java

En Java, las variables se pueden clasificar en tres categorías principales según su ámbito y comportamiento:

#### 1. Variables de Instancia
- Se definen dentro de una clase pero fuera de cualquier método.
- Cada objeto de la clase tiene su propia copia de estas variables.
- Se inicializan cuando se crea un objeto y pueden tener diferentes valores en cada instancia.

**Ejemplo:**
```java
class Persona {
    String nombre;  // Variable de instancia
    int edad;       // Variable de instancia

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
```
En este caso, cada objeto de la clase `Persona` tendrá su propio valor para los atributos `nombre` y `edad`.

#### 2. Variables Locales
- Se declaran dentro de un método, constructor o bloque.
- Solo existen dentro del método donde fueron declaradas.
- No tienen valores predeterminados, por lo que deben inicializarse antes de usarse.

**Ejemplo:**
```java
class Calculadora {
    int sumar(int a, int b) {
        int resultado = a + b;  // Variable local
        return resultado;
    }
}
```
Aquí, la variable `resultado` solo existe dentro del método `sumar()` y no puede ser accedida desde fuera.

#### 3. Variables Estáticas (`static`)
- Se declaran con la palabra clave `static`.
- Son **compartidas** por todas las instancias de la clase.
- Se almacenan en la memoria **estática**, lo que significa que solo hay **una copia** de la variable para toda la clase.
- Pueden ser accedidas directamente a través del nombre de la clase, sin necesidad de crear un objeto.

**Ejemplo:**
```java
class Contador {
    static int cuenta = 0;  // Variable estática

    Contador() {
        cuenta++;  // Incrementa la variable cada vez que se crea un objeto
    }
}
```

Uso en un programa:
```java
public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        System.out.println("Número total de objetos creados: " + Contador.cuenta);
    }
}
```

**Salida:**
```
Número total de objetos creados: 3
```

Aquí, aunque se crean tres objetos de la clase `Contador`, la variable `cuenta` es compartida entre todos ellos y no pertenece a un objeto en particular.

#### 4. Variables Constantes (`final`)
- Se declaran con la palabra clave `final`.
- Su valor **no puede cambiar** después de haber sido asignado.
- Deben ser inicializadas al momento de su declaración o en el constructor de la clase.
- Se utilizan para definir **constantes**, como valores matemáticos o configuraciones que no deben modificarse.

**Ejemplo de variable `final`:**
```java
class Configuracion {
    static final double PI = 3.1416;  // Constante compartida por toda la clase
}
```

Uso en un programa:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("El valor de PI es: " + Configuracion.PI);
    }
}
```

**Salida:**
```
El valor de PI es: 3.1416
```
Intentar modificar `PI` generará un error, ya que es una constante.

### 4.2 Modificadores de Acceso en Java

Los modificadores de acceso determinan el nivel de **visibilidad** y **control** que tienen las variables y métodos dentro de un programa.

#### Tipos de Modificadores de Acceso  

| Modificador | Alcance | Uso |
|-------------|----------|-------------|
| `private` | Solo dentro de la misma clase | Protege datos sensibles, como contraseñas o saldos bancarios. |
| `default` *(sin modificador)* | Dentro del mismo paquete | Se usa cuando no se especifica un modificador explícito. |
| `protected` *(no usado en esta unidad)* | En la misma clase y en subclases | Permite el acceso en clases hijas, pero no desde fuera del paquete. |
| `public` | En cualquier parte del programa | Permite acceso sin restricciones a la variable o método. |

### Ejemplo de Encapsulación con Modificadores de Acceso  

La **encapsulación** es el principio de la POO que restringe el acceso directo a los atributos de un objeto y obliga a usar métodos para acceder y modificar los datos.

```java
class CuentaBancaria {
    private double saldo;  // Variable privada

    // Constructor para inicializar el saldo
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("No se puede depositar una cantidad negativa.");
        }
    }

    // Método público para obtener el saldo
    public double obtenerSaldo() {
        return saldo;
    }
}
```

### Uso del Código en un Programa  
```java
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}
```

**Salida:**
```
Saldo actual: 1500.0
```

### 4.3 Diferencias Clave entre `static` y `final`  

| Palabra Clave | Descripción | Ejemplo |
|--------------|---------------------------------|--------------------------------|
| `static` | Indica que la variable pertenece a la **clase** y es compartida por todos los objetos. | `static int contador;` |
| `final` | Indica que el valor de la variable **no puede cambiar** después de su asignación. | `final double PI = 3.1416;` |

**Ejemplo combinando `static` y `final`:**  
```java
class Configuracion {
    static final String NOMBRE_EMPRESA = "TechCorp";  // Constante global
}
```

Uso en un programa:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Empresa: " + Configuracion.NOMBRE_EMPRESA);
    }
}
```

**Salida:**
```
Empresa: TechCorp
```
Aquí, `NOMBRE_EMPRESA` es **estática**, lo que significa que pertenece a la clase y no a un objeto, y es **final**, lo que significa que su valor no puede cambiar.

---

## 5. Getters y Setters

En la **Programación Orientada a Objetos (POO)**, uno de los principios más importantes es el **encapsulamiento**, que consiste en ocultar los detalles internos de un objeto y permitir el acceso a sus atributos solo mediante métodos específicos.  

Para aplicar el encapsulamiento en Java, es una buena práctica declarar los atributos de una clase como **privados (`private`)** y proporcionar métodos públicos llamados **getters y setters** para acceder y modificar esos atributos de manera controlada.  

### 5.1 ¿Qué son los Getters y Setters?  

Los **getters** y **setters** son métodos especiales que permiten acceder y modificar los atributos privados de un objeto.  

- **Getters:** Métodos que devuelven el valor de un atributo privado.  
- **Setters:** Métodos que permiten modificar el valor de un atributo privado, aplicando validaciones si es necesario.  

#### Ventajas de Usar Getters y Setters
✔ **Encapsulación:** Evitan el acceso directo a los atributos, protegiendo la integridad de los datos.  
✔ **Control de Acceso:** Permiten aplicar reglas y validaciones antes de modificar un atributo.  
✔ **Flexibilidad:** Si la implementación de una variable cambia en el futuro, solo es necesario modificar los métodos en la clase, sin afectar otras partes del código.  
✔ **Mantenimiento del Código:** Facilitan la depuración y modificación de atributos sin afectar otras clases.  

### 5.2 Ejemplo de Uso de Getters y Setters  

En el siguiente ejemplo, la clase `Persona` tiene dos atributos privados `nombre` y `edad`. Se utilizan métodos **getter** y **setter** para acceder y modificar estos atributos de manera segura.

```java
class Persona {
    private String nombre;
    private int edad;

    // Constructor para inicializar los atributos
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad con validación
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}
```

### 5.3 Uso de Getters y Setters en un Programa  

```java
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Persona
        Persona persona1 = new Persona("Luis", 25);

        // Obtener valores con getters
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        // Modificar valores con setters
        persona1.setNombre("Carlos");
        persona1.setEdad(30);

        System.out.println("Nuevo Nombre: " + persona1.getNombre());
        System.out.println("Nueva Edad: " + persona1.getEdad());

        // Intentar establecer una edad negativa (validación)
        persona1.setEdad(-5);
    }
}
```

**Salida del programa:**
```
Nombre: Luis
Edad: 25
Nuevo Nombre: Carlos
Nueva Edad: 30
La edad no puede ser negativa.
```

Aquí se observa que:
- Se obtienen los valores iniciales de `nombre` y `edad` usando los **getters**.  
- Se modifican los valores con los **setters** y se imprimen los cambios.  
- Al intentar asignar una edad negativa, el **setter** muestra un mensaje de error sin modificar el atributo, aplicando una validación.  

### 5.4 Diferencias entre Acceso Directo y Getters/Setters

#### Acceso Directo a los Atributos (NO RECOMENDADO)
```java
class Persona {
    public String nombre;
    public int edad;
}
```
En este caso, cualquier código externo puede modificar `nombre` y `edad` sin restricciones, lo que podría generar inconsistencias en los datos.

#### Uso de Getters y Setters (RECOMENDADO)
```java
class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida.");
        }
    }
}
```
Con esta estructura, se controla el acceso y modificación de los atributos, evitando errores e inconsistencias.

---

## 6. Método toString()

### 6.1 ¿Qué es el Método `toString()`?  

El método `toString()` en Java se usa para obtener una representación en texto de un objeto.  

Por defecto, si se intenta imprimir un objeto en `System.out.println()`, Java mostrará una referencia en memoria, a menos que se sobrescriba el método `toString()` en la clase.  

### 6.2 Ventajas del Método `toString()`
✔ Facilita la depuración mostrando información legible del objeto.  
✔ Permite imprimir objetos directamente en la consola sin necesidad de acceder manualmente a cada atributo.  
✔ Se usa automáticamente cuando un objeto es concatenado con una cadena de texto.  

### 6.3 Ejemplo de `toString()` en Java  

```java
class Persona {
    private String nombre;
    private int edad;

    // Constructor
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "Persona { Nombre: " + nombre + ", Edad: " + edad + " }";
    }
}
```

### 6.4 Uso del Método `toString()` en un Programa  

```java
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto
        Persona persona1 = new Persona("Ana", 28);

        // Uso del método toString()
        System.out.println(persona1);
    }
}
```

**Salida del programa:**
```
Persona { Nombre: Ana, Edad: 28 }
```

Aquí se observa que **`toString()`** se invoca automáticamente cuando se pasa el objeto `persona1` a `System.out.println()`, generando una salida más legible.

### 6.5 Uso de `toString()` en Concatenación de Cadenas
Otra ventaja del método `toString()` es que se llama implícitamente cuando se concatena un objeto con una cadena de texto.

```java
public class Main {
    public static void main(String[] args) {
        Persona persona2 = new Persona("Carlos", 35);
        System.out.println("Datos: " + persona2);
    }
}
```

**Salida:**
```
Datos: Persona { Nombre: Carlos, Edad: 35 }
```
En este caso, Java llama automáticamente a `toString()` al concatenar `persona2` con `"Datos: "`.