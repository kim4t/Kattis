import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<x;i++) {
            int a = sc.nextInt();
            if(a%400 == 0) {
                a = a/400;
            }else {
                a = a/400;
                a+=1;
            }
            System.out.println(a);
            
        }

    }

}