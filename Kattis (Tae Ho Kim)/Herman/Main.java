import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.6f",Math.pow(n, 2)*Math.PI);
        System.out.println();
        System.out.printf("%.6f",2*Math.pow(n, 2));
    }

}