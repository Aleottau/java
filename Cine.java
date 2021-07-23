
/*
Sesión 2 - Actividad
La empresa cine-mintic esta requiriendo
un nuevo software para la compra de
boletos. El programa se encargara de
vender boletos mostrando la distribucion
de silla de una sala "N"x"N". Cuando una
silla se encuentre vacia se representara
con un 0, cuando la silla se encuentre
ocupada se representara con un 1. Si se
intenta comprar una silla ya comprada el
sistema alertara que no es posible la
compra de este asiento. El programa contara
con la siguientes opciones:
1. Vender boletos
2. Cancelar boletos
3. Estadisticas
4. Salir
   1  2  3  4
1 [1, 1, 1, 0]
2 [0, 0, 1, 1]
3 [0, 0, 0, 0]
4 [0, 0, 0, 0]
--------------
*/
// Librerias
import java.util.Scanner;

/**
 * Clase principal
 */
public class Cine {
    /**
     * Funcion para crear sala vacia
     * 
     * @param n Numero de filas y columnas
     * @return Matriz resultante
     */
    public static int[][] crear_sala(int n) {
        int[][] rows = new int[n][n];
        return rows;
    }

    /**
     * Metodo para imprimir la sala
     * 
     * @param a Matriz de la sala
     * @param n Numero de filas y columnas
     */
    public static void imp_sala(int[][] a, int n) {
        System.out.print("   ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " [");
            String sep = "";
            for (int j = 0; j < n; j++) {
                System.out.print(sep + a[i][j]);
                sep = " ";
            }
            System.out.println("]");
        }
        System.out.print("---");
        for (int i = 0; i < n; i++) {
            System.out.print("--");
        }
        System.out.println();
    }

    /**
     * Funcion que calcula cuantas sillas fueron vendidas
     * 
     * @param a Matriz de la sala
     * @return Retorna el numero de asientos ocupados
     */
    public static int estadisticas(int[][] a) {
        int contar = 0;
        for (int[] fila : a) {
            for (int celda : fila) {
                if (celda == 1) {
                    contar++;
                }
            }
        }
        return contar;
    }

    /**
     * Metodo para vender boletos
     * 
     * @param a Matriz de la sala
     * @param n Numero de filas y columnas
     */
    public static void vender(int[][] a, int n, Scanner inInt, Scanner inStr) {
        // Pedir cantidad por pantalla
        System.out.print("Cantidad de boletos: ");
        int num = inInt.nextInt();
        // Numero de sillas total
        int sillas = n * n;
        // Calcular numero de sillas asignadas
        int asignadas = estadisticas(a);
        // Validar disponibilidad
        if (num > sillas - asignadas) {
            System.out.println("No hay sucientes sillas disponibles");
        } else {
            int i = 1;
            // Ciclo de venta
            while (i <= num) {
                System.out.print("Fila y columna del boleto " + i + ":");
                String silla = inStr.nextLine();
                String[] pos = silla.split(" ");
                int fil = Integer.parseInt(pos[0]) - 1;
                int col = Integer.parseInt(pos[1]) - 1;
                if (fil >= 0 && col >= 0 && fil <= n - 1 && col <= n - 1) {
                    if (a[fil][col] == 0) {
                        a[fil][col] = 1;
                        i += 1;
                    } else {
                        System.out.print("Silla ocupada. Presione enter para continuar...");
                        inStr.nextLine();
                        continue;
                    }
                } else {
                    System.out.print("Silla no existe. Presione enter para continuar...");
                    inStr.nextLine();
                    continue;
                }
            }
        }
    }

    /**
     * Metodo para cancelar boletos
     * 
     * @param a Matriz de la sala
     * @param n Numero de filas y columnas
     */
    public static void cancelar(int[][] a, int n, Scanner inInt, Scanner inStr) {
        // Pedir cantidad por pantalla
        System.out.print("Cantidad de boletos: ");
        int num = inInt.nextInt();
        // Calcular numero de sillas asignadas
        int asignadas = estadisticas(a);
        // Validar disponibilidad
        if (num > asignadas) {
            System.out.println("No hay sucientes sillas asignadas");
        } else {
            int i = 1;
            // Ciclo de venta
            while (i <= num) {
                System.out.print("Fila y columna del boleto " + i + ":");
                String silla = inStr.nextLine();
                String[] pos = silla.split(" ");
                int fil = Integer.parseInt(pos[0]) - 1;
                int col = Integer.parseInt(pos[1]) - 1;
                if (fil >= 0 && col >= 0 && fil <= n - 1 && col <= n - 1) {
                    if (a[fil][col] == 1) {
                        a[fil][col] = 0;
                        i += 1;
                    } else {
                        System.out.print("Silla no ocupada. Presione enter para continuar...");
                        inStr.nextLine();
                        continue;
                    }
                } else {
                    System.out.print("Silla no existe. Presione enter para continuar...");
                    inStr.nextLine();
                    continue;
                }
            }
        }
    }

    /**
     * Metodo para imprimir el menu
     */
    public static void menu() {
        clear();
        System.out.println("+---------------------+");
        System.out.println("| 1. Vender boletos   |");
        System.out.println("| 2. Cancelar boletos |");
        System.out.println("| 3. Estadisticas     |");
        System.out.println("| 4. Cancelar funcion |");
        System.out.println("| 5. Salir            |");
        System.out.println("+---------------------+");
    }

    /**
     * Metodo para limpiar la pantalla
     */
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Metodo principal de ejecucion
     * 
     * @param args Parametros de entrada
     */
    public static void main(String[] args) {
        int opc = 0;
        int n = 8;
        int[][] a = crear_sala(n);
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        do {
            // Ejecutar funcion del menu
            menu();
            // Pedir opcion por pantalla
            System.out.print("Digite una opcion: ");
            opc = inInt.nextInt();
            if (opc == 5) {
                break;
            }
            imp_sala(a, n);
            switch (opc) {
                case 1:
                    vender(a, n, inInt, inStr);
                    break;
                case 2:
                    cancelar(a, n, inInt, inStr);
                    break;
                case 3:
                    int e = estadisticas(a);
                    System.out.println("Total de sillas: " + (n * n));
                    System.out.println("Sillas vendidas: " + e);
                    System.out.println("Sillas disponibles: " + ((n * n) - e));
                    break;
                case 4:
                    a = crear_sala(n);
                    break;
            }
            System.out.print("Presione enter para continuar...");
            inStr.nextLine();
        } while (opc != 5);
        inInt.close();
        inStr.close();
    }
}