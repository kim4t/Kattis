import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            if (a - b == 1) {
                System.out.println("Dr. Chaz needs " + (a - b) + " more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + (a - b) + " more pieces of chicken!");
            }
        } else {
            if (b - a == 1) {
                System.out.println("Dr. Chaz will have " + (b - a) + " piece of chicken left over!");
            } else {
                System.out.println("Dr. Chaz will have " + (b - a) + " pieces of chicken left over!");
            }

        }
    }
    

}