public class Test {
    /**
     * Realizar pruebas con los estaticos
     */
    public static void main(String[] args) {
        StaticExplain se1 = new StaticExplain();
        StaticExplain se2 = new StaticExplain();
        se1.edad = 5;
        se2.edad = 55;
        System.out.println(StaticExplain.edad);
        StaticExplain.cambiarEdad(39);
        System.out.println(se1.edad);
        System.out.println(se2.edad);
        System.out.println(StaticExplain.edad);
    }
}
