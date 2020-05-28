import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> s = new HashSet<>();
        sc.next();
        for (int i = 0; i < 12; i++) {
            String a = sc.next();
            String b = sc.next();
            if(s.contains(a)) {
                i--;
            }else {
                s.add(a);
                System.out.println(a+" "+b);
            }
        }
    }
}
