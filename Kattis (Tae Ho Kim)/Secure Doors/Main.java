import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> in = new HashSet<>();
        Set<String> out = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            String name = s[1];
            if(s[0].equals("entry")) {
                if(in.contains(name)) {
                    System.out.println(name+" entered (ANOMALY)");
                }else {
                    System.out.println(name+" entered");
                    in.add(name);
                }
            }else {
                if(in.contains(name)) {
                    System.out.println(name+" exited");
                    in.remove(name);
                }else {
                    System.out.println(name+" exited"+ " (ANOMALY)");
                }
                
            }
            
        }
    }
}