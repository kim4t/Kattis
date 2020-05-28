import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            for (int j = 0; j < g; j++) {
                int a = sc.nextInt();
                if (arr.contains(a)) {
                    int index = arr.indexOf(a);
                    arr.remove(index);
                } else {
                    arr.add(a);
                }
            }
            int print = 0;
            for (int a : arr) {
                print += a;
            }
            System.out.println("Case #"+(i+1)+": "+print);
            arr.clear();
        }
        
    }
}
