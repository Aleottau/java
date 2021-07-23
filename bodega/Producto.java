public class Producto {
    int codigo;
    double precio;
    int cantidadBodega;
    int cantidadMinima;

    // Constructor por Defecto
    public Producto() {
    }

    // Constructor con paramatros
    public Producto(int codigo, double precio, int cantidadBodega, int cantidadMinima) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
    }

    boolean solicitarPedido() {
        // Version resumida de la condicion
        return cantidadBodega < cantidadMinima;
        /*
        // Version anticuada
        if(cantidadBodega < cantidadMinima) {
            return true;
        } else {
            return false;
        }
        */
    }

    int cantidadSolitud() {
        return cantidadMinima - cantidadBodega + 10;
    }
}