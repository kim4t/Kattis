import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int n = line.length();
        double whiteSpace = 0;
        double lower = 0;
        double upper = 0;
        double symbol = 0;
        for (int i = 0; i < n; i++) {
            if ((int) line.charAt(i) == 95) {
                whiteSpace++;
            } else if ((int) line.charAt(i) >= 97 && (int) line.charAt(i) <= 122) {
                lower++;
            } else if ((int) line.charAt(i) >= 65 && (int) line.charAt(i) <= 90) {
                upper++;
            } else {
                symbol++;
            }
        }
        System.out.println(whiteSpace / n);
        System.out.println(lower / n);
        System.out.println(upper / n);
        System.out.println(symbol / n);
    }
}

//a = 97
//z = 122
//A = 65
//Z = 90
//_ = 95