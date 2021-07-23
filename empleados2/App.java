public class App {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        e.setId("100002");
        e.setName("Ruthford Jay");
        e.setSex("M");
        e.setSalary(1500000);
        System.out.println(e);
        Clase p = new Clase(5);
        // Forma de instanciar subclases
        Clase.SubClase h = (p).new SubClase();
        System.out.println(h.potencia());
    }
}
