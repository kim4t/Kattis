import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();

        String a = "";
        String b = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            a += x.charAt(i);
            b += y.charAt(i);
        }

        int v1 = Integer.parseInt(a);
        int v2 = Integer.parseInt(b);
        if (v1 > v2) {
            System.out.println(v1);
        } else {
            System.out.println(v2);
        }

    }
}
