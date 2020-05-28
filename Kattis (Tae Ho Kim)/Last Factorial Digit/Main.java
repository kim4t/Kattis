import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int v = 1;
            int l = 1;
            for (int j = 0; j < t; j++) {
                v = v * l;
                l++;
                if (l > t) {
                    break;
                }
            }
            v = v % 10;
            System.out.println(v);
        }
        

    }

}