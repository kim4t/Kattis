import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<num;i++) {
            arr.add(sc.nextInt());
        }
        
        for(int i=0;i<arr.size()-1;i++) {
            if(arr.get(i)>arr.get(i+1)) {
                count++;
            }
        }
        System.out.println(++count);

    }

}