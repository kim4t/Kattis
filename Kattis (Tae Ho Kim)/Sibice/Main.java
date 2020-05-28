import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        for(int i=0;i<n;i++) {
            int v = sc.nextInt();
            if(v <= Math.sqrt(Math.pow(w, 2)+Math.pow(h, 2))) {
                System.out.println("DA");
            }else {
                System.out.println("NE");
            }
        }
    }
}