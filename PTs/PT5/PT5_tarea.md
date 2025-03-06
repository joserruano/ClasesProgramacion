# Tarea para la PT5: Gestión de Almacén con Faker.java  

Esta tarea es un **requisito obligatorio para la Prueba Técnica 5** en la cual se evaluará la capacidad de los alumnos para modificar y extender este sistema con nuevas funcionalidades. Por tanto, **no se podrá realizar la PT5 sin haber completado antes esta tarea**.

---

## Requisitos del Sistema  

1. **Crear la clase `Producto`**, que debe contener:  
   - `nombre` (String)  
   - `codigo` (String)  
   - `cantidad` (int)  
   - `precio` (double)  

2. **Crear la clase `Almacen`**, que debe contener:  
   - **Un array de productos**.  
   - Métodos para gestionar los productos.  
   - **Esta clase no debe imprimir nada en consola, solo manejar los datos**. 
   - **Los métodos de esta clase solo deben devolver datos a `Main`, que será la encargada de imprimirlos.**   

3. **Implementar un menú en la clase `Main`**, donde:  
   - Se generen **1000 productos aleatorios** usando `Faker.java`.  
   - Se impriman los mensajes al usuario.  
   - Se llame a los métodos de `Almacen` según las opciones del menú.  
   - **La clase `Main` debe ser la única que imprima por consola**.  

---

## Menú  
El sistema debe mostrar un **menú en consola** con las siguientes opciones:  

```
===== GESTIÓN DE ALMACÉN =====
1. Mostrar todos los productos  
2. Buscar un producto por código  
3. Agregar stock a un producto  
4. Retirar stock de un producto  
5. Eliminar un producto  
6. Salir  
Seleccione una opción:
```

### Detalles de cada opción:
**Opción 1: Mostrar todos los productos**  
   - Llama a un método de `Almacen` que retorne la lista de productos y los imprime en el `Main`.  
   - Formato de impresión:  
     ```
     Código: A1B2C3 | Nombre: Laptop | Cantidad: 10 | Precio: 800.00 €
     ```

**Opción 2: Buscar un producto por código**  
   - Pide al usuario un código y busca el producto en `Almacen`.  
   - Si el producto existe, el `Main` lo imprime.  
   - Si no existe, el `Main` imprime: `"Producto no encontrado."`  

**Opción 3: Agregar stock a un producto**  
   - Pide al usuario un código y una cantidad.  
   - Si el producto existe, se **agrega la cantidad** al stock.  
   - Si no existe, el `Main` imprime: `"Producto no encontrado."`  

**Opción 4: Retirar stock de un producto**  
   - Pide al usuario un código y una cantidad.  
   - Se verifica que la cantidad a retirar **no haga que el stock sea negativo**.  
   - Si la cantidad es mayor al stock actual, el `Main` imprime: `"No se puede retirar más stock del disponible."`  
   - Si el código no existe, el `Main` imprime: `"Producto no encontrado."`  

**Opción 5: Eliminar un producto**  
   - Pide al usuario un código.  
   - **Solo se puede eliminar un producto si su cantidad es 0.**  
   - Si el producto tiene stock, el `Main` imprime: `"No se puede eliminar un producto con stock disponible."`  
   - Si el código no existe, el `Main` imprime: `"Producto no encontrado."`  

**Opción 6: Salir**  
   - Finaliza la ejecución del programa.