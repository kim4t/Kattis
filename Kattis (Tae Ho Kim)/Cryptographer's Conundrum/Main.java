import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String line = sc.next();
        char[] arr = new char[line.length()];
        for (int i = 0; i < arr.length - 2; i+=3) {
            arr[i] = 'P';
            arr[i + 1] = 'E';
            arr[i + 2] = 'R';

        }
        for (int i = 0; i < arr.length; i++) {
            if (line.charAt(i) != arr[i]) {
                count++;
            }
        }
        System.out.println(count);
        
    }

}
