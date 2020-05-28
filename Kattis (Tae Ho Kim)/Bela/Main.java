import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7' };
        int[] domi = { 11, 4, 3, 20, 10, 14, 0, 0 };
        int[] noDomi = { 11, 4, 3, 2, 10, 0, 0, 0 };
        int n = sc.nextInt();
        String d = sc.next();
        String a = "";
        int total = 0;
        int index = 0;
        for (int i = 0; i < n * 4; i++) {
            a = sc.next();
            for (int j = 0; j < cArr.length; j++) {
                if (a.charAt(0) == cArr[j]) {
                    index = j;

                }
            }
            if (a.charAt(1) == d.charAt(0)) {
                total += domi[index];
            } else {
                total += noDomi[index];
            }

        }
        System.out.println(total);
    }
}