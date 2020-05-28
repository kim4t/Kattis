import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, String> map = new HashMap<>();
        map.put("a", "2");
        map.put("b", "22");
        map.put("c", "222");
        map.put("d", "3");
        map.put("e", "33");
        map.put("f", "333");
        map.put("g", "4");
        map.put("h", "44");
        map.put("i", "444");
        map.put("j", "5");
        map.put("k", "55");
        map.put("l", "555");
        map.put("m", "6");
        map.put("n", "66");
        map.put("o", "666");
        map.put("p", "7");
        map.put("q", "77");
        map.put("r", "777");
        map.put("s", "7777");
        map.put("t", "8");
        map.put("u", "88");
        map.put("v", "888");
        map.put("w", "9");
        map.put("x", "99");
        map.put("y", "999");
        map.put("z", "9999");
        map.put("@", "0");
        int k = 1;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().replaceAll(" ", "@").split("");
            System.out.print("Case #" + k + ": ");
            for (int j = 0; j < s.length - 1; j++) {
                System.out.print(map.get(s[j]));
                if (map.get(s[j]).charAt(0) == map.get(s[j + 1]).charAt(0)) {
                    System.out.print(" ");
                }
            }
            System.out.println(map.get(s[s.length - 1]));
            k++;
        }

    }
}