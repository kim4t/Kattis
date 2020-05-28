import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int[] arr = new int[k];
            int total = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                total += arr[j];
            }
            double avg = total / k;
            int above = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    above++;
                }
            }
            double print = (double) above / arr.length * 100;

            System.out.printf(String.format("%.3f", print));
            System.out.print("%\n");
        }
    }
}