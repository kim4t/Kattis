import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
        for (int a = 0; a < c; a++) {
            char[] s = sc.nextLine().toCharArray();
            int n = (int) Math.sqrt(s.length);
            n = n * n >= s.length ? n : n + 1;
            String st = "";
            for (int i = 0; i < n; i++) {
                int col = n * (n - 1) + i;
                for (int j = 0; j < n; j++) {
                    int row = col - n * j;
                    if (row < s.length) {
                        st += s[row];
                    }
                }
            }
            System.out.println(st);
        }

    }
}