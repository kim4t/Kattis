import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[]arr = s.split("-");
        String display = "";
        for(int i=0;i<arr.length;i++) {
            display+=arr[i].charAt(0);
        }
        System.out.println(display);

    }

}