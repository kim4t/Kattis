import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = h * 60 + m;
        if(t>45) {
        t = t - 45;
        }else {
            t = t-45+(60*24);
        }
        System.out.print(t / 60 + " " + t % 60);
    }
}
