import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int s = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            if ((i + 1) % p == 0) {
                arr1.add(1);
            } else {
                arr1.add(0);
            }
            if ((i + 1) % q == 0) {
                arr2.add(1);
            } else {
                arr2.add(0);
            }
        }
        boolean y = false;
        for (int i = 0; i < s; i++) {
            if (arr1.get(i) == 1 && arr2.get(i) == 1) {
                y = true;
                break;
            }
        }
        if (y) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
