import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> arr = new ArrayList<>();
            int total = 0;
            while (true) {
                int a = sc.nextInt();
                if (a == 0) {
                    break;
                }
                arr.add(a);
            }
            for(int j=0;j<arr.size()-1;j++) {
                if(arr.get(j+1)-arr.get(j)*2>=0)
                total+= arr.get(j+1)-(arr.get(j)*2);
            }
            
            System.out.println(total);
        }
    }

}