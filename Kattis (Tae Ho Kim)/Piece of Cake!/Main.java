import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int length1 = 0;
        int length2 = 0;
        if (h>n-h) {
            length1 = h;
        } else {
            length1 = n - h;
        }
        if (v>n-v) {
            length2 = v;
        } else {
            length2 = n - v;
        }
        System.out.println(length1 * length2 * 4);

    }
}