import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = 0;

        int empty = a + b;
        int n = empty / c;
        int r = empty % c;
        total += n;

        while (true) {
            empty = n + r;
            if(empty/c==0) {
                break;
            }
            n = empty / c;
            r = empty % c;
            total += n;
        }
        System.out.println(total);
    }
}