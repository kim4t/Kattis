import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int pow = p % 10;
            p = (p-pow)/10;
            output += Math.pow(p, pow);

        }
        System.out.println(output);
    }
}