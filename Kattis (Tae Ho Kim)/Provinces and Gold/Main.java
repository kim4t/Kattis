import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int s = sc.nextInt();
        int c = sc.nextInt();

        int cost = 0;
        int buy = 0;
        cost = (6 * g) + (3 * s);
        buy = (3 * g) + (2 * s) + c;
        if (buy >= 8) {
            System.out.print("Province or ");
        } else if (buy >= 5) {
            System.out.print("Duchy or ");
        } else if (buy >= 2) {
            System.out.print("Estate or ");
        }

        if (buy >= 6) {
            System.out.print("Gold");
        } else if (buy >= 3) {
            System.out.print("Silver");
        } else {
            System.out.print("Copper");
        }

    }
}