import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(arr);
        List<Integer> a = new ArrayList<>();
        int k = 0;

        a.add(arr.get(k));
        for (int i = k; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) == 1) {
                a.add(arr.get(i + 1));
                if (i + 1 == arr.size() - 1) {
                    if (a.size() > 2) {
                        System.out.print(a.get(0) + "-" + a.get(a.size() - 1) + " ");
                    } else {
                        for (int j = 0; j < a.size(); j++) {
                            System.out.print(a.get(j) + " ");
                        }
                    }
                    a.clear();
                }
            } else {
                if (a.size() > 2) {
                    System.out.print(a.get(0) + "-" + a.get(a.size() - 1) + " ");
                } else {
                    for (int j = 0; j < a.size(); j++) {
                        System.out.print(a.get(j) + " ");
                    }
                }
                a.clear();
                a.add(arr.get(i + 1));
            }

        }
        if(a.size()!=0) {
            for (int j = 0; j < a.size(); j++) {
                System.out.print(a.get(j) + " ");
            }
        }

        // System.out.println(a);
    }
}
