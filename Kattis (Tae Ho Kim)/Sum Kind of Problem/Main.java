import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(sc.nextInt() + " ");
            int a = sc.nextInt();
            int total = 0;
            if(a%2==0) {
                int b = a/2;
                int c= a;
                for (int j = 1; j <= b; j++) {
                    total += j+c;
                    c--;
                }
            }else {
                int b = a/2;
                int c = a-1;
                for (int j = 1; j <= b; j++) {
                    total += j+c;
                    c--;
                }
                total+=a;
            }
            
            System.out.print(total+" ");
            System.out.print(2*total-a+" ");
            System.out.println(2*total);
        }

    }

}