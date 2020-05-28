import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        boolean dup = false;
        Set<String> s = new HashSet<>();
        
        for(int i=0;i<arr.length;i++) {
            
            if(s.contains(arr[i])) {
                dup = true;
                break;
            }else {
                s.add(arr[i]);
            }
        }
        if (dup) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}