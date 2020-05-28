import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double print = s * 1000 * 5280 / 4854;
        print = Math.round(print);
        System.out.println((int)print);

    }
}