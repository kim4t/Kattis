import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            int a = n;
            if (makeArr(a)) {
                System.out.println(a);
                break;
            } else {
                n++;
            }
        }
    }

    public static boolean makeArr(int a) {
        String s = String.valueOf(a);
        String[] arr = s.split("");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Integer.parseInt(arr[i]);
        }
        if (a % total == 0) {
            return true;
        } else {
            return false;
        }

    }
}