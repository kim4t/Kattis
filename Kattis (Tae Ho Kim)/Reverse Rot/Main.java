import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = new char[28];
        for (int i = 0; i < 26; i++) {
            c[i] = (char) ('A' + i);
        }
        c[26] = '_';
        c[27] = '.';
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            String s = sc.next();
            char[] arr = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < c.length; j++) {
                    if (s.charAt(i) == c[j]) {
                        if (j + n < c.length) {
                            arr[i] = c[j+n];
                        } else {
                            arr[i] = c[j+n-c.length];
                        }
                    }
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            System.out.println();

        }

    }

}