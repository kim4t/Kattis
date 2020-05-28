import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("apa", "a");
        s = s.replace("ipi", "i");
        s = s.replace("epe", "e");
        s = s.replace("opo", "o");
        s = s.replace("upu", "u");
        System.out.println(s);
    }

}