import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int d1 = b-a;
        int d2 = c-b;
        if(d1<=d2) {
            System.out.println(d2-1);
        }else {
            System.out.println(d1-1);
        }
    }
}
