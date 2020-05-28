import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            Set<String> s = new HashSet<>();
            for (int j = 0; j < k; j++) {
                s.add(sc.next());
            }
            System.out.println(s.size());
            s.clear();
        }

    }

}