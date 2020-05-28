import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            if (s.length > 2 && s[0].equals("simon") && s[1].equals("says")) {
                for (int j = 2; j < s.length; j++) {
                    System.out.print(s[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
