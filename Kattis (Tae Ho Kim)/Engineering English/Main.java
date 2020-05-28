import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        Set<String> set = new HashSet<>();
        while (sc.hasNext()) {
            String s[] = sc.nextLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                if (set.contains(s[i].toLowerCase())) {
                    System.out.print(". ");
                } else {
                    System.out.print(s[i] + " ");
                    set.add(s[i].toLowerCase());
                }

            }System.out.println();
        }

    }
}
