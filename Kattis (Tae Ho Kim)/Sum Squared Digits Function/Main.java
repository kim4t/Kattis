import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print(sc.nextInt() + " ");
            int b = sc.nextInt();
            int n = sc.nextInt();
            int total = 0;
            while (n >= b) {
                int a = n % b;

                total += Math.pow(a, 2);

                n = n / b;
            }
            total += Math.pow(n, 2);
            System.out.println(total);

        }
    }
}
