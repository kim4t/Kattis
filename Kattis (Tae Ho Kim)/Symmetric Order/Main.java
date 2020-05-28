mport java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            System.out.println("SET " + num);
            num++;
            List<String> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.next());
            }

            if (n % 2 == 0) {
                int i = 0;
                int j = n - 1;
                while (i <= n - 1) {
                    System.out.println(arr.get(i));
                    i += 2;
                }
                while (j >= 0) {
                    System.out.println(arr.get(j));
                    j -= 2;
                }
            } else {
                int i = 0;
                int j = n - 2;
                while (i <= n - 1) {
                    System.out.println(arr.get(i));
                    i += 2;
                }
                while (j >= 0) {
                    System.out.println(arr.get(j));
                    j -= 2;
                }
            }

        }
    }
}
