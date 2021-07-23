package basicos;

public class Operaciones {
    // Zona de Atributos
    public int a;
    public int b;

    // Zona de Metodos
    public int sumar() {
        return a + b;
    }

    public int resta() {
        return a - b;
    }

    public void imprimir() {
        System.out.println(a + " " + b);
    }

    // Metodo de ejecucion
    public static void main(String[] args) {
        // Nueva Instancia
        Operaciones o1 = new Operaciones();
        // Nueva Instancia
        Operaciones o2 = new Operaciones();
        // Copia de o2
        Operaciones o3 = o2;
        o1.a = 5;
        o1.b = 6;
        o2.a = 7;
        o2.b = 1;
        o3.a = 99;
        o3.b = 15;
        System.out.println("o1->suma: " + o1.sumar());
        System.out.println("o2->suma: " + o2.sumar());
        System.out.println("o3->suma: " + o3.sumar());
        o1.imprimir();
        o2.imprimir();
        o3.imprimir();
    }
}
