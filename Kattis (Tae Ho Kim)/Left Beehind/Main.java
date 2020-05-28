import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String arr[] = { "To the convention.", "Left beehind.", "Never speak again.", "Undecided." };
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
                 break;
            }
            if(x+y==13) {
                System.out.println(arr[2]);
            }else if(x>y) {
                System.out.println(arr[0]);
            }else if(x<y) {
                System.out.println(arr[1]);
            }else {
                System.out.println(arr[3]);
            }
        }
    }

}