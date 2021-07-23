import java.util.Scanner;
import java.util.Locale;
public class reto1 {

    public static double[][] crearmatriz(int n) {
        double[][] matriz = new double[n][4];
        return matriz;
    }

    public static double methodmayor(double[][] matriz, int n) {
        double mayor = 0;
        double id = 0;
        for (int i = 0; i < n; i++) {
            if (matriz[i][2] == 1) {
                if (mayor < matriz[i][3]) {
                    mayor = matriz[i][3];
                    id =matriz[i][0];
                }
                
            }
        }
        return id;

    }
    public static void  student (double id ) {
        if (id == 1.0) {
            System.out.println("armando");
        } else if (id == 2.0){
            System.out.println("nicolas");
        } else if(id ==3.0){
            System.out.println("daniel");
        } else if (id == 4.0){
            System.out.println("maria");
        } else if (id == 5.0){
            System.out.println("marcela");
        } else {
            System.out.println("alexandra");
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String[] vector =  new String[n];

        for (int i=0; i<n;i++) {
            vector[i] = in.nextLine();
        }
        double prom = 0;

        double[][] matriz = crearmatriz(n);

        for (int i = 0; i < n; i++) {
            String[] res = vector[i].split(" ");
            
            matriz[i][0] = Double.parseDouble(res[0]);
            matriz[i][1] = Double.parseDouble(res[1]);
            matriz[i][2] = Double.parseDouble(res[2]);
            matriz[i][3] = Double.parseDouble(res[3]);

        }
        double sum = 0;
        int cont1 = 0;
        float cont2 = 0;
        float tot =0;
        int[] cont3 = new int[3]; 
        for (int i = 0; i < n; i++) {
            sum += matriz[i][3];
        }
        prom =sum/n;
        
        for (int i = 0; i < n; i++) {
            if (matriz[i][3] < prom ) {
                cont1++; 
            }
            if (matriz[i][3] > 9.0) {
                cont2 ++;

            }
            if (matriz[i][3] < 6.1 && matriz[i][2] == 1.0 ) {
                cont3[0] ++;
            }
            if (matriz[i][3] < 6.1 && matriz[i][2] == 2.0 ) {
                cont3[1] ++;
            }
            if (matriz[i][3] < 6.1 && matriz[i][2] == 3.0 ) {
                cont3[2] ++;
            }
        }
        

        tot= cont2/n;
        System.out.println(cont1);
        System.out.println(String.format(Locale.US, "%.2f", tot));
        
        if (cont3[0]>= cont3[1]  && cont3[0] >= cont3[2]) {
            System.out.println("idiomas");
            
        } else  if ( cont3[1]>= cont3[0]  && cont3[1] >= cont3[2] ) {
            System.out.println("historia");
            
        } else  {
            System.out.println("literatura");
            
        }
        
        double idd = methodmayor(matriz, n);

        student(idd);


        

        in.close();

    }
    
}
