import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (set1.contains(a)) {
                set2.add(a);
            } else {
                set1.add(a);
            }
            arr.add(a);
        }

        if (set1.size() == set2.size()) {
            System.out.println("none");
        } else {
            List<Integer> arr2 = new ArrayList<>(set2);
            for (int i = 0; i < arr2.size(); i++) {
                set1.remove(arr2.get(i));
            }
            List<Integer> arr1 = new ArrayList<>(set1);

            Collections.sort(arr1);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == arr1.get(arr1.size() - 1)) {

                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}