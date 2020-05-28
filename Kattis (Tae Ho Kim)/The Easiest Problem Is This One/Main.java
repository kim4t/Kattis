import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            String[] arr = String.valueOf(a).split("");
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += Integer.parseInt(arr[i]);
            }
            findP(a, total);

        }

    }

    public static void findP(int a, int total) {
        int v = 11;
        while (true) {
            int p = v * a;
            String[] arr = String.valueOf(p).split("");
            int total2 = 0;
            for (int i = 0; i < arr.length; i++) {
                total2 += Integer.parseInt(arr[i]);
            }
            if (total2 == total) {
                System.out.println(v);
                break;
            }
            
            v++;

        }
    }

}
