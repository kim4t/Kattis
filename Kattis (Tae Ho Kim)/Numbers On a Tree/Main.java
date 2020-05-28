import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        double node = Math.pow(2, n + 1) - 1;
        if (s.length == 1) {
            System.out.printf("%.0f", node);
        } else {
            ArrayList<Character> arr = new ArrayList<>();
            for (int i = 0; i < s[1].length(); i++) {
                arr.add(s[1].charAt(i));
            }
            int p = 1;
            for(int i=0;i<s[1].length();i++) {
                if(s[1].charAt(i)=='L') {
                    node-=p;
                    p*=2;
                }else {
                    node-=p+1;
                    p*=2;
                    p++;
                }
            }
            System.out.printf("%.0f", node);
        }

    }
}