package reto;

import java.util.Locale;
import java.util.Scanner;

public class ClaseReto {
    // Zona de Atributos
    // Numero de iteraciones
    private int n;
    // Arreglos Contadores
    private int[] cnt;
    // Arreglos Promedios
    private double[] prom;
    // Definicion de matriz resultante
    private double[][] matriz;

    // Constructor
    public ClaseReto() {
        cnt = new int[6];
        prom = new double[6];
    }

    // Zona de metodos
    // Metodo para leer datos
    public void leerDatos() {
        // Instancia de clase para captura de datos por pantalla
        Scanner in = new Scanner(System.in);
        // Captura de numero de registros que se van a procesar
        this.n = Integer.parseInt(in.nextLine());
        // Definicion del vector lectura de lineas en pantalla
        String[] lineas = new String[n];
        // Ciclo para lectura del arreglo linea por linea
        for (int i = 0; i < n; i++) {
            lineas[i] = in.nextLine();
        }
        this.matriz = new double[n][4];
        // Ciclo de transformacion
        for (int i = 0; i < n; i++) {
            // Se divide la cadena por espacios
            String[] res = lineas[i].split(" ");
            // Se asigna cada dato a la matriz
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Double.parseDouble(res[j]);
            }
        }
        // Cerrar lectura
        in.close();
    }

    public String pregunta1() {
        // Declaracion de variables del metodo
        double sumatoria = 0;
        // Ciclo para promedio
        for(double[] fila : matriz){
            sumatoria += fila[3];
        }
        // Retornar valor
        return String.format(Locale.US, "%.2f", sumatoria);
    }

    public String pregunta2() {
        // Ciclo para contador
        for(int i = 0; i < n; i++){
            int id = (int)matriz[i][0];
            cnt[id - 1]++;
        }
        // Impresion de contadores
        return String.format(Locale.US, "[%d %d %d %d %d %d]", cnt[0], cnt[1], cnt[2], cnt[3], cnt[4], cnt[5]);
    }

    public String pregunta3() {
        // Ciclo para promedio
        for(int i = 0; i < n; i++){
            int id = (int)matriz[i][0];
            prom[id - 1] += matriz[i][3];
        }
        // Impresion de promedios
        return String.format(Locale.US, "[%.2f %.2f %.2f %.2f %.2f %.2f]", prom[0]/cnt[0], prom[1]/cnt[1], prom[2]/cnt[2], prom[3]/cnt[3], prom[4]/cnt[4], prom[5]/cnt[5]);
    }
}
