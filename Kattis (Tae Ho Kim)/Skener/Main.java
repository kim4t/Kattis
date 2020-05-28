import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();
        for (int i = 0; i < r; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j = 0; j < zr; j++) {
                for (int e = 0; e < arr.length; e++) {

                    for (int t = 0; t < zc; t++) {

                        System.out.print(arr[e]);
                    }
                }
                System.out.println();
            }
        }
    }
}