import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int min = 99;
            int max = 0;
            for (int j = 0; j < b; j++) {
                int s = sc.nextInt();
                if (s > max) {
                    max = s;
                }
                if (s < min) {
                    min = s;
                }
            }
            System.out.println(2 * (max - min));
        }
    }
}
