import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        int maxDay = 0;
        int j=-1;
        for(int i=0;i<arr.size();i++) {
            int a = arr.get(i)+ ++j;
            if(a >= maxDay) {
                maxDay = a;
            }
        }
        System.out.println(maxDay + 2);

    }

}
