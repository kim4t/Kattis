import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            boolean simon = false;
            boolean says = false;
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals("Simon")) {
                    simon = true;
                }
                if (s[j].equals("says")) {
                    says = true;
                }
            }

            if (simon && says) {
                for (int j = 2; j < s.length; j++) {
                    System.out.print(s[j] + " ");
                }
                System.out.println();
            }
            
        }

    }

}