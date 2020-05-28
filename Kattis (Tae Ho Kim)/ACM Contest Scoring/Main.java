import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> wrong = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int total = 0;
        while(true) {
            String a = sc.next();
            if(a.equals("-1")) {
                break;
            }
            String b = sc.next();
            String c = sc.next();
            if(c.equals("right")) {
                set.add(b);
                total+= Integer.parseInt(a);
            }else {
                String[]s = new String[3];
                s[0] = a;
                s[1] = b;
                s[2] = c;
                wrong.add(s);
            }
        }
        for(int i=0;i<wrong.size();i++) {
            if(set.contains(wrong.get(i)[1])) {
                total+= 20;
            }
        }
        System.out.println(set.size()+" "+total);
        

    }

}