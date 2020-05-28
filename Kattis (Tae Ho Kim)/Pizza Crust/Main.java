import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        double print = (Math.pow(r - c, 2) / Math.pow(r, 2));
        System.out.println(print*100);

    }

}