public class StaticExplain {
    String nombre;
    String apellido;
    public static int edad = 18;

    /**
     * Este es un ejemplo donde se debe
     * colocar el nombre de la clase para
     * un atributo estatico
     * @param edad
     */
    public static void cambiarEdad(int edad) {
        StaticExplain.edad = edad;
    }

    public static void test() {
        cambiarEdad(5);
    }
}