
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    public Producto(){}
    public Producto(int id, String nombre, String descripcion, double precio, int cantidadEnStock){
        //Si los set no tienen condición podemos asignar directamente en el constructor.
        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        if (precio >= 0){
            this.precio = precio;
        }
    }

    public int getCantidadEnStock() {
        return this.cantidadEnStock;
    }
    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public String toString() {
        return this.id + " | " + this.nombre + " | " + this.descripcion + " | "+ this.precio + " | " + this.cantidadEnStock;
    }
    
}
