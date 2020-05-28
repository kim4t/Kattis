import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double total = 0;
        double count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a != -1) {
                total += a;
                count++;
            } 

        }
        System.out.println(total /  count);
    }
}
