import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        // como tomar datos  y guardarlos en un  vector
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        System.out.println(n);
        String[] vector = new String[n];
        for (int i = 0; i < n; i++) {
            vector[i] = in.nextLine();
        }
        
        in.close();
        


    }
    
}
