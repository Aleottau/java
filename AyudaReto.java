// Importar libreria para captura de datos
import java.util.Locale;
import java.util.Scanner;

public class AyudaReto {
    /**
     * Metodo principal de la clase
     * 
     * @param args Argumentos por consola
     */
    public static void main(String[] args) {
        // Instancia de clase para captura de datos por pantalla
        Scanner in = new Scanner(System.in);
        // Captura de numero de registros que se van a procesar
        int n = Integer.parseInt(in.nextLine());
        // Definicion del vector lectura de lineas en pantalla
        String[] lineas = new String[n];
        // Ciclo para lectura del arreglo linea por linea
        for (int i = 0; i < n; i++) {
            lineas[i] = in.nextLine();
        }
        // Arreglos Contadores
        int[] cnt = new int[6];
        // Arreglos Promedios
        double[] prom = new double[6];
        // Definicion de matriz resultante
        double[][] matriz = new double[n][4];
        // Ciclo de transformacion
        for (int i = 0; i < n; i++) {
            // Se divide la cadena por espacios
            String[] res = lineas[i].split(" ");
            // Se asigna cada dato a la matriz
            matriz[i][0] = Double.parseDouble(res[0]);
            matriz[i][1] = Double.parseDouble(res[1]);
            matriz[i][2] = Double.parseDouble(res[2]);
            matriz[i][3] = Double.parseDouble(res[3]);
            /*
            for (int j = 0; j < 4; j++) {
                reg[i][j] = Double.parseDouble(res[j]);
            }
            */
            System.out.println(lineas[i]);
        }
        
        // Ciclo de escritura
        for(double[] fila : matriz){
            System.out.println(String.format(Locale.US, "[%.2f %.2f %.2f %.2f]", fila[0], fila[1], fila[2], fila[3]));
        }
        // Declaracion de variables
        double sumatoria = 0;
        // Ciclo para promedio
        /*
        for(double[] fila : matriz){
            sumatoria += fila[3];
        }
        */
        for(int i = 0; i < n; i++){
            sumatoria += matriz[i][3];
            int id = (int)matriz[i][0];
            cnt[id - 1]++;
            prom[id - 1] += matriz[i][3];
        }
        // Impresion del promedio
        System.out.println(String.format(Locale.US, "El promedio es %.2f", sumatoria / n));
        // Impresion de contadores
        System.out.println(String.format(Locale.US, "[%d %d %d %d %d %d]", cnt[0], cnt[1], cnt[2], cnt[3], cnt[4], cnt[5]));
        // Impresion de promedios
        System.out.println(String.format(Locale.US, "[%.2f %.2f %.2f %.2f %.2f %.2f]", prom[0]/cnt[0], prom[1]/cnt[1], prom[2]/cnt[2], prom[3]/cnt[3], prom[4]/cnt[4], prom[5]/cnt[5]));
        // Finalizar instancia de captura
        in.close();
    }
}
