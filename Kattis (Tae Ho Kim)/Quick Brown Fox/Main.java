import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set<Character> set = new HashSet<>();

        for (int i = 97; i < 123; i++) {
            set.add((char) i);
        }
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().toLowerCase();
            Set<Character> s2 = new HashSet<>(set);
            for (int j = 0; j < s.length(); j++) {
                if (s2.contains(s.charAt(j))) {
                    s2.remove(s.charAt(j));
                }
            }

            if (s2.size() == 0) {
                System.out.println("pangram");
            } else {
                System.out.print("missing ");
                List<Character> c = new ArrayList<>(s2);
                for (int j = 0; j < s2.size(); j++) {
                    System.out.print(c.get(j));
                }
                System.out.println();
            }
        }
    }
}