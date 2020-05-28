import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int k = 1;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            List<Double> v1 = new ArrayList<>();
            List<Double> v2 = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                v1.add(sc.nextDouble());
            }
            for (int j = 0; j < a; j++) {
                v2.add(sc.nextDouble());
            }

            Collections.sort(v1);
            Collections.sort(v2);
            
            
        
            

            double print = 0;
            for (int j = 0; j < v1.size(); j++) {
                print += v1.get(j) * v2.get(v1.size()-1-j);
            }
            System.out.print("Case #" + k + ": ");
            System.out.printf("%.0f",print);
            System.out.println();
            k++;

        }

    }

}

