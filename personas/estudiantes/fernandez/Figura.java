package estudiantes.fernandez;

public class Figura {
    public int a;
    protected int b;
    private int c;
    int d;

    protected void iniciar(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public class Circulo {
        public void suma() {
            iniciar(10, 2, 3, 4);
            System.out.println(a+b+c+d);
        }
    }
}
