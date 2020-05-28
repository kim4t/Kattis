import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String display = "no hiss";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 's') {
                        display = "hiss";
                    }
                }
            }
        }
        System.out.println(display);
    }

}
