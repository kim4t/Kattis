import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < p; i++) {
            set.add(sc.nextInt());
        }
        set.add(w);

        List<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        Collections.reverse(arr);
        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                set.add(arr.get(i) - arr.get(j));

            }
        }

        arr = new ArrayList<>(set);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
