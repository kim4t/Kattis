import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
             String s = sc.next();
             int [] arr = new int[s.length()];
             int k = 0;
             for(int j=s.length()-1;j>=0;j--) {
                 arr[k] = Integer.parseInt(String.valueOf(s.charAt(j)));
                 k++;
             }
             for(int j=0;j<arr.length;j++) {
                 if((j+1)%2==0 ) {
                     arr[j]  = arr[j]*2;
                     if(arr[j]/10==1) {
                         String ss = String.valueOf(arr[j]);
                         int a1 = Integer.parseInt(String.valueOf(ss.charAt(0)));
                         int a2 = Integer.parseInt(String.valueOf(ss.charAt(1)));
                         arr[j] = a1+a2;
                     }
                 }
             }
             
             
             int total = 0;
             for(int j=0;j<arr.length;j++) {
                 total+=arr[j];
             }
             
             if(total%10 == 0) {
                 System.out.println("PASS");
             }else {
                 System.out.println("FAIL");
             }
        }
        

    }
}