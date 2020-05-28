import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = { 'A', 'B', 'C' };
        char[] b = { 'B', 'A', 'B', 'C' };
        char[] c = { 'C', 'C', 'A', 'A', 'B', 'B' };
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int a2 = 0;
        int b2 = 0;
        int c2 = 0;
        int n = sc.nextInt();
        String s = sc.next();
        char[] adrian = new char[n];
        char[] bruno = new char[n];
        char[] goran = new char[n];
        for (int i = 0; i < n; i++) {
            adrian[i] = a[a1];
            bruno[i] = b[b1];
            goran[i] = c[c1];
            if (a1 == 2) {
                a1 = -1;
            }
            if (b1 == 3) {
                b1 = -1;
            }
            if (c1 == 5) {
                c1 = -1;
            }
            a1++;
            b1++;
            c1++;
        }

        
    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == adrian[i]) {
                ++a2;
            }
            if (s.charAt(i) == bruno[i]) {
                ++b2;

            }
            if (s.charAt(i) == goran[i]) {
                ++c2;
            }
        }

        int[] arr = new int[3];
        arr[0] = a2;
        arr[1] = b2;
        arr[2] = c2;
        Arrays.sort(arr);
        System.out.println(arr[2]);
        if (arr[1] == arr[2]) {
            if (arr[0] == arr[1]) {
                System.out.println("Adrian");
                System.out.println("Bruno");
                System.out.println("Goran");
            } else {
                if (arr[0] == a2) {
                    System.out.println("Bruno");
                    System.out.println("Goran");
                } else if (arr[0] == b2) {
                    System.out.println("Adrian");
                    System.out.println("Goran");
                } else {
                    System.out.println("Adrian");
                    System.out.println("Bruno");
                }
            }
        } else {
            if (arr[2] == a2) {
                System.out.println("Adrian");
            } else if (arr[2] == b2) {
                System.out.println("Bruno");
            } else {
                System.out.println("Goran");
            }
        }

    }
}