import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        Double n = sc.nextDouble();
        Double total = 0.0;
        for (int i = 0; i < n; i++) {
            Double x = sc.nextDouble();
            Double y = sc.nextDouble();
            total += x * y * c;
        }
        System.out.printf("%.7f",total);
    }

}