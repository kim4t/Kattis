import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < 4; i++) {
            totalA += sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            totalB += sc.nextInt();
        }
        if (totalA > totalB) {
            System.out.println("Gunnar");
        } else if (totalA < totalB) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }

}