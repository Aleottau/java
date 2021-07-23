public class App {
    int a;
    boolean b;
    String c;
    /**
     * Contructor por defecto
     */
    public App() {
        a = 500;
        b = true;
        c = "Hola Mundo!";
    }
    /**
     * Constructor para yz motivo
     * @param a Porque el profesor dijo
     */
    public App(int a) {
        this.a = a;
    }
    /**
     * Contructor para otro motivo
     * @param a Porque si
     * @param b Se necesita
     * @param c Deje asi
     */
    public App(int a, boolean b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // No es error, es un Code Smell
    public void app() {
        
    }
    // No es error, es un Code Smell
    public int appHola(int a) {
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        App a = null;
        System.out.println(a);
        a = new App();
        System.out.println(a);
        System.out.println(a.a + " " + a.b + " " + a.c);
        App b = new App(10, false, "Como?");
        System.out.println(b);
        System.out.println(b.a + " " + b.b + " " + b.c);
        App c = new App(100);
        System.out.println(c);
        System.out.println(c.a + " " + c.b + " " + c.c);
    }
}
