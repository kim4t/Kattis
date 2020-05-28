import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            List<String> arr = new ArrayList<>();
            for (int j = 0; j < s.length; j++) {
                arr.add(s[j]);
            }
            while (true) {
                String[] l = sc.nextLine().split(" ");
                if (l.length != 3) {
                    break;
                }
                for (int j = 0; j < arr.size(); j++) {
                    if(arr.get(j).equals(l[2])) {
                        arr.remove(j);
                        --j;
                    }
                }
            }
            for (int j = 0; j < arr.size(); j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }
    }
}
