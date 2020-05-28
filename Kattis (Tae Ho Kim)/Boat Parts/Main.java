import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
            count++;
            if (set.size() == p) {
                System.out.println(count);
                break;
            }
        }
        if (set.size() != p) {
            System.out.println("paradox avoided");
        }

    }

}