import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String x = sc.next();
            String y = sc.next();
            System.out.println(x);
            System.out.println(y);
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == y.charAt(j)) {
                    System.out.printf(".");
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
            System.out.println();
        }

    }
}
