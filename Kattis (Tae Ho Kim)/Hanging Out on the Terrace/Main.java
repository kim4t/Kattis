import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        int n = 0;
        for (int i = 0; i < x; i++) {
            String s = sc.next();
            if (s.equals("enter")) {
                int a = sc.nextInt();
                if (n + a <= l) {
                    n += a;
                } else {
                    count++;
                }
            } else {
                int a = sc.nextInt();
                n -= a;
            }
        }
        System.out.println(count);
    }
}
