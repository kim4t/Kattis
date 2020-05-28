import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = Integer.toBinaryString(a);
        char[] arr = s.toCharArray();
        String reverse = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse += arr[i];
        }
        int print = Integer.parseInt(reverse,2);
        System.out.println(print);
    }
}