import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            System.out.println("Case " + t + ": " + arr.get(0) + " " + arr.get(arr.size() - 1) + " "
                    + (arr.get(arr.size() - 1) - arr.get(0)));
            t++;

        }

    }

}