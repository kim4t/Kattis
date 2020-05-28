import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char[] arr = sc.next().toCharArray();
            int size = (int) Math.sqrt(arr.length);
            char[][] s = new char[size][size];
            for (int j = 0; j < arr.length; j++) {

                s[j / size][j % size] = arr[j];

            }

            for (int a = size - 1; a >= 0; a--) {
                for (int b = 0; b < size; b++) {

                    System.out.print(s[b][a]);
                }
            }
            System.out.println();

        }
    }
}
