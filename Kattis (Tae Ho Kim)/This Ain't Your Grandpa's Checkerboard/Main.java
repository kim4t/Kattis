import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean r1 = true;
        boolean r2 = true;
        boolean r3 = true;
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = s[j];
            }
        }
        r1 = checkR1(arr);
        r2 = checkR2(arr);
        r3 = checkR3(arr);
        
        if (r1 && r2 && r3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static boolean checkR1(String[][] arr) {
        int b = 0;
        int w = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].equals("B")) {
                    b++;
                } else {
                    w++;
                }
            }
            if (b != w) {
                return false;
            }

        }
        return true;

    }

    public static boolean checkR2(String[][] arr) {
        int b = 0;
        int w = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i].equals("B")) {
                    b++;
                } else {
                    w++;
                }
            }
            if (b != w) {
                return false;
            }
        }
        return true;

    }

    public static boolean checkR3(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i][j].equals(arr[i][j - 1]) && arr[i][j].equals(arr[i][j + 1])) {
                    return false;
                }
            }
        }
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i - 1][j].equals(arr[i][j]) && arr[i][j].equals(arr[i + 1][j])) {
                    return false;
                }
            }
        }
        return true;

    }
}