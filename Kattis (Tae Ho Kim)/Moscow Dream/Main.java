import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        
        boolean notZero = true;
        boolean biggerThanN = true;
        boolean smallN = false;
        if(a==0 || b==0 || c==0) {
            notZero = false;
        }
        
        if(a+b+c<n) {
            biggerThanN = false;
        }
        if(n<3) {
            smallN = true;
        }
        if(notZero && biggerThanN && !smallN) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

}