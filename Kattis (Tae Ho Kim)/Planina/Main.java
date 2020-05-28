import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 3;

        //  2   4   8    16
        //3   5   9   17   33
        
        double total = 0;
        for(int i=1;i<n;i++) {
            double a = Math.pow(2, i);
            total += a;
        }
        double display = a1+total;
        display = Math.pow(display, 2);
        System.out.println((int)display);
    }
}