import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Instancia de captura de datos en pantalla
        Scanner in = new Scanner(System.in);
        // Lectura de codigo en pantalla
        int codigoPantalla = Integer.parseInt(in.nextLine());
        // Lectura de precio en pantalla
        double precioPantalla = Double.parseDouble(in.nextLine());
        // Lectura de cantidad en bodega en pantalla
        int cantidadBodegaPantalla = Integer.parseInt(in.nextLine());
        // Lectura de cantidad minima en pantalla
        int cantidadMinimaPantalla = Integer.parseInt(in.nextLine());
        // Instancia de la clase Producto
        Producto productoObjeto = new Producto();
        // Asignamos los valores a los atributos del objeto
        productoObjeto.codigo = codigoPantalla;
        productoObjeto.precio = precioPantalla;
        productoObjeto.cantidadBodega = cantidadBodegaPantalla;
        productoObjeto.cantidadMinima = cantidadMinimaPantalla;
        // Crear una condicion
        if(productoObjeto.solicitarPedido()) {
            System.out.println("Se debe realizar pedido al Proveedor de "+ productoObjeto.cantidadSolitud() +" unidades!!");
        } else {
            System.out.println("No se requiere realizar pedido al Proveedor!!");
        }
        // Cerrar instancia
        in.close();
    }
}