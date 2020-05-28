import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                int a = sc.nextInt();
                String s = sc.next();
                arr.add(a/2);
                map.put(a/2, s);

            } catch (Exception e) {
                String s = sc.next();
                int a = sc.nextInt();
                arr.add(a);
                map.put(a, s);
            }

        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++) {
            System.out.println(map.get(arr.get(i)));
        }
    }

}