import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<=r;i++) {
            set.add(i);
        }
        for(int i=0;i<n;i++) {
            set.remove(sc.nextInt());
        }
        if(set.size()==0) {
            System.out.println("too late");
        }else {
            ArrayList<Integer> arr = new ArrayList<>(set);
            System.out.println(arr.get(0));
        }
    }
}