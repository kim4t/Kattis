import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n-=1;
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++) {
            int t = a;
            a = b;
            b = t+b;
        }

        System.out.println(a + " " + b);
    }

}