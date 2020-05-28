import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            String[] arr = sc.next().split("");
            if(arr[0].contentEquals("P")) {
                System.out.println("skipped");
            }else {
                int index = 0;
                String total1 = "";
                String total2 = "";
                for(int j=0;j<arr.length;j++) {
                    if(arr[j].contentEquals("+")) {
                        index = j;
                    }
                }
                for(int j=0;j<index;j++) {
                    total1+=arr[j];
                }
                for(int j=index+1;j<arr.length;j++) {
                    total2+=arr[j];
                }
                System.out.println(Integer.parseInt(total1)+Integer.parseInt(total2));
            }
        }
    }

}