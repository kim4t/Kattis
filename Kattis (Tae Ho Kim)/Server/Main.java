import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<=t) {
                t-=arr[i];
                count ++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}