import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        double[][] arr= new double[n][2];
        for (int i = 0; i < n; i++) {
           arr[i][0] = sc.nextDouble();
           arr[i][1] = sc.nextDouble();
        }
        for(int i=0;i<arr.length-1;i++) {
            double v = (arr[i+1][0]-arr[i][0])*((arr[i][1]+arr[i+1][1])/2);
            v = v/1000;
            total+=v;
        }
        System.out.println(total);
    }

}