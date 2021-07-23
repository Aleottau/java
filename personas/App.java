import estudiantes.fernandez.Figura;

public class App {
    int a;
    int b;

    void metodo1() {
        a = 1;
        b = 1;
    }

    void metodo2() {
        a += 5;
        b += 10;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        App app = new App();
        app.metodo2();
        app.metodo1();
        Figura f1 = new Figura();
        f1.a = 0;
        estudiantes.medina.Figura f2 = new estudiantes.medina.Figura();
        f2.a = 1;
        Figura.Circulo f3 = (f1).new Circulo();
        f3.suma();
        System.out.println(f1.a);
    }
}