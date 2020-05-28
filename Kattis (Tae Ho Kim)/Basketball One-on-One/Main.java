import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        int a = 0;
        int b = 0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i].equals("A")) {
                a+=Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("B")) {
                b+=Integer.parseInt(arr[i+1]);
            }
        }
        if(a>b) {
            System.out.println("A");
        }else {
            System.out.println("B");
        }
    }
}