import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        String s = "";
        for(int i=0;i<a.length();i++) {
            char c = a.charAt(i);
            if(c=='0') {
                c='1';
            }else {
                c='0';
            }
            s+=c;
        }
        if (n % 2 != 0) { // odd
            if(b.equals(s)) {
                System.out.println("Deletion succeeded");
            }else {
                System.out.println("Deletion failed");
            }
            
        } else { // even
            
            if(a.equals(b)) {
                System.out.println("Deletion succeeded");
            }else {
                System.out.println("Deletion failed");
            }
        }

    }
}
