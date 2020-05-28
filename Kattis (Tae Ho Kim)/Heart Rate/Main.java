import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double b = sc.nextDouble();
            double p = sc.nextDouble();
            double bpm = 60*b/p;
            double v = bpm/b;
            double minAbpm = bpm-v;
            double maxAbpm = bpm+v;
            System.out.printf("%.4f",minAbpm);
            System.out.printf(" %.4f",bpm);
            System.out.printf(" %.4f",maxAbpm);
            System.out.println();
        }

    }

}
