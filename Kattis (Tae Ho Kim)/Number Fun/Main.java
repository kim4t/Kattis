import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int arr[] = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            if (arr[0] + arr[1] == arr[2]) {
                System.out.println("Possible");
            } else if (arr[0] * arr[1] == arr[2]) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }

}