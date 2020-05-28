import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int max = maximum(arr);
        int index = 0;
        for (int i = 0; i < n - 2; i++) {
            int m = findMax(arr.get(i), arr.get(i + 2));
            if (m < max) {
                max = m;
                index = i;
            }
        }
        System.out.println(index+1+" "+max);

    }

    private static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    private static int maximum(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }
}
