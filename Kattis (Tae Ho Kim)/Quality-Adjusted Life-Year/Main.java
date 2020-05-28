import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        double display = 0;
        for(int i=0;i<n;i++) {
            double q= sc.nextDouble();
            double y = sc.nextDouble();
            display += q*y;
        }
        System.out.println(display);

    }
}
