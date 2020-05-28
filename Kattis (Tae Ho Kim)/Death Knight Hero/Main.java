import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = 0;
        for(int i=0;i<n;i++) {
            char[] arr = sc.next().toCharArray();
            boolean win = true;
            for(int j=1;j<arr.length;j++) {
                if(arr[j-1]=='C' && arr[j] =='D') {
                    win = false;
                    break;
                }
            }
            
            if(win) w++;
                
        }
        System.out.println(w);

    }
}
