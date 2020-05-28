import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(s + ":");
        for (int i = 2; i <= s / 2 + 1; i++) {
            for (int j = i - 1; j <= i; j++) {
                if (s % (i + j) == 0) {
                    System.out.println(i + "," + j);
                } else if ((s - i) % (i + j) == 0) {
                    System.out.println(i + "," + j);
                }

            }
        }
    }
}