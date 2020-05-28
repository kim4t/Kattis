import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            int e = x;
            x = y;
            y = e;
        }
        int t = y - x;
        for (int i = 1; i <= t + 1; i++) {
            System.out.println(x + i);
        }
    }
}
