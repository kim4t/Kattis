import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println("Bob");
        }else {
            System.out.println("Alice");
        }

    }

}