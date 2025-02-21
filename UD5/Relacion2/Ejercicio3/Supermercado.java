
import java.util.ArrayList;


public class Supermercado {
   private ArrayList<Producto> listaProductos;
   
   public Supermercado(){
        this.listaProductos = new ArrayList<Producto>();
   }
   public Supermercado(ArrayList<Producto> listaProductos){
        setListaProductos(listaProductos);
   }

    public ArrayList<Producto> getListaProductos() {
        return this.listaProductos;
    }
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = (ArrayList<Producto>)listaProductos.clone();
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    public boolean venderProducto(int id){
        boolean ventaRealizada = false;
        Producto productoVenta = this.buscarProducto(id);
        if (productoVenta != null && productoVenta.getCantidadEnStock() > 0){
            int cantidadActual = productoVenta.getCantidadEnStock();
            productoVenta.setCantidadEnStock(cantidadActual-1);
            ventaRealizada = true;
        }
        return ventaRealizada;
    }
    public boolean venderProducto(int id, int cantidad){
        boolean ventaRealizada = false;
        Producto productoVenta = this.buscarProducto(id);
        if (productoVenta != null && productoVenta.getCantidadEnStock() >= cantidad){
            int cantidadActual = productoVenta.getCantidadEnStock();
            productoVenta.setCantidadEnStock(cantidadActual-cantidad);
            ventaRealizada = true;
        }
        return ventaRealizada;
    }

    private Producto buscarProducto(int id){
        boolean encontrado = false;
        Producto productoFinal = null;
        for (int i = 0; i < listaProductos.size() && !encontrado; i++) {
            if (this.listaProductos.get(i).getId() == id){
                encontrado = true;
                productoFinal = this.listaProductos.get(i);
            } 
        }
        return productoFinal;
    }
    
    public String mostrarInventario(){
        String inventario = "";
        for (Producto producto : listaProductos) {
            inventario += producto + "\n";
        }
        return inventario;
    }

    public String toString() {
        return mostrarInventario();
    }

}
