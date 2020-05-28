import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            if(n==-1) {
                break;
            }
            int total=0; int a=0; int b=0; int c=0;
            for(int i=0;i<n;i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                total+=(a*(b-c));
                c=b;
            }
            System.out.println(total+" miles");
        }
    }
}