import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&b==0) {
                break;
            }
            int v = a/b;
            a = a%b;
            System.out.println(v+" "+a+" / "+b);
        }

    }

}