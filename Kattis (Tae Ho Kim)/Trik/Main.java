import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intArr[] = { 1, 0, 0 };
        String s = sc.next();
        char arr[] = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'A') {
                intArr = a(intArr);
            } else if (arr[i] == 'B') {
                intArr = b(intArr);
            } else {
                intArr = c(intArr);
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }

    }

    public static int[] a(int intArr[]) {
        int t = intArr[0];
        intArr[0] = intArr[1];
        intArr[1] = t;
        return intArr;

    }

    public static int[] b(int intArr[]) {
        int t = intArr[1];
        intArr[1] = intArr[2];
        intArr[2] = t;
        return intArr;

    }

    public static int[] c(int intArr[]) {
        int t = intArr[0];
        intArr[0] = intArr[2];
        intArr[2] = t;
        return intArr;

    }

}