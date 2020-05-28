import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int row=0;
        for (int i = 0; i < 5; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if(a+b+c+d>total) {
                total = a+b+c+d;
                row = i;
            }
        }
        System.out.println(row+1+" "+total);
    }
}
