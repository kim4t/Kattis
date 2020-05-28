import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s1 = new String[n];
        String[] origin = new String[n];
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            s1[i] = a;
            origin[i] = a;
        }

        Arrays.sort(s1);
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i].equals(s1[i])) {

            } else {
                increase = false;
                break;
            }
        }
        Arrays.sort(s1, Collections.reverseOrder());
        for (int i = 0; i < origin.length; i++) {
            if (origin[i].equals(s1[i])) {

            } else {
                decrease = false;
                break;
            }
        }

        if (increase) {
            System.out.println("INCREASING");
        } else if (decrease) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

    }

}