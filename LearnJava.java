import java.util.Locale;
import java.util.Scanner;

public class LearnJava {
    public static void main(String[] args) {
        // Instancia de lectura por pantalla
        Scanner in = new Scanner(System.in);
        // Ejemplos de los Tipos
        int a = 2;
        float b = 2;
        char c = ' ';
        double d = 2;
        boolean e = true;
        String salida = a + b + c + d + "" + e;
        System.out.println(salida);
        salida = "" + a + b + c + d + e;
        System.out.println(salida);
        // Ejemplo de captura por pantalla
        System.out.print("Numero 1: ");
        int a1 = in.nextInt();
        System.out.print("Numero 2: ");
        int b1 = in.nextInt();
        int c1 = a1 + b1;
        System.out.println("La suma es: " + c1);
        // Ejemplo de condicional Si
        int a2 = in.nextInt();
        if(a2 > 5) {
            System.out.println(a2*a2);
        } else {
            System.out.println(a2%2);
        }
        // Ejemplo de condicionales Si - Multiples
        int a3 = in.nextInt();
        if(a3 >= 0 && a3 < 5) {
            System.out.print("a*a =>");
            System.out.println(a3*a3);
        } else if(a3 >= 5 && a3 < 9) {
            System.out.print("a%2 =>");
            System.out.println(a3%2);
        } else if(a3 >= 9 && a3 < 14) {
            System.out.print("a+2 =>");
            System.out.println(a3+2);
        } else {
            System.out.print("a-2 =>");
            System.out.println(a3-2);
        }
        // Ejemplo de condicionales Si - Anidados
        int a4 = in.nextInt();
        if(a4 >= 0 && a4 < 5) {
            if(a4 == 4) {
                System.out.print(a4*a4);
            } else {
                System.out.println(a4-2);
            }
        }
        // Ejemplo de condicionales Dependiendo De
        int a5 = in.nextInt();
        switch(a5) {
            case 0:
                System.out.println("Alberto César");
                break;
            case 1:
                System.out.println("Angie Cruz");
                break;
            case 2:
                System.out.println("Blanca Reyes");
                break;
            case 3:
                System.out.println("Carlos Rodriguez");
                break;
            default:
                System.out.println("Ruthford Jay");
                break;
        }
        // Ejemplos de Ciclos
        int a6 = in.nextInt();
        System.out.println("For Basico");
        for(int i = 1;i <= a6; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nFor Complejo");
        for(int i = 1, j = a6;i <= a6 && j >= 1; i++, j--) {
            System.out.print(i + " ");
            System.out.print(j + " ");
        }
        System.out.println("\nMientras Que");
        int i = 1;
        while(i <= a6) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\nHaga Hasta");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= a6);
        // Ejemplo con Foreach
        System.out.println("\nPara Cada Uno");
        int[] listado = {0, 1, 1, 2, 3, 5, 8};
        for(int iterador : listado) {
            System.out.print(iterador + " ");
        }
        // Bloque de Excepciones
        System.out.println("\nManejo de Errores");
        try {
            int div = 1 / 0;
            System.out.println(div);
        } catch (Exception err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
        // Ejemplo de Redondeo
        System.out.println("\nRedondeos");
        double n1 = 15.6586546;
        System.out.println(n1 + " => " + Math.round(n1));
        System.out.println(n1 + " => " + String.format("%.2f", n1));
        System.out.println(n1 + " => " + String.format(Locale.US, "%.2f", n1));
        // Conversiones
        System.out.println(Short.parseShort("1"));
        System.out.println(Integer.parseInt("1"));
        System.out.println(Long.parseLong("1"));
        System.out.println(Double.parseDouble("1"));
        // Finalizar Instancia de lectura por pantalla
        in.close();
    }
}