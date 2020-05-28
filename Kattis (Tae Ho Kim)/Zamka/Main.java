import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        String min = "";
        int minTotal = 0;
        String max = "";
        int maxTotal = 0;

        for (int i = l; i <= d; i++) {
            min = String.valueOf(i);
            minTotal = 0;
            for (int j = 0; j < min.length(); j++) {
                minTotal += (int) min.charAt(j) - 48;
            }
            if (minTotal == x) {
                break;
            }
        }

        for (int i = d; i >= l; i--) {
            max = String.valueOf(i);
            maxTotal = 0;
            for (int j = 0; j < max.length(); j++) {
                maxTotal += (int) max.charAt(j) - 48;
            }
            if (maxTotal == x) {
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
