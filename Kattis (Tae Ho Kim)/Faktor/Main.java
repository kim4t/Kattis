import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x * y;
        int b = x * (y - 1);

        if (b / x != y) {
            b += 1;
        }

        System.out.println(b);
    }
}
