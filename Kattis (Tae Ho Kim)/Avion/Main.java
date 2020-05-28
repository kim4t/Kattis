import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for(int i=0;i<5;i++) {
            String s = sc.next();
            if(s.contains("FBI")) {
                System.out.print(i+1+" ");
                a++;
            }
        }
        if(a==0) {
            System.out.println("HE GOT AWAY!");
        }
    }
}