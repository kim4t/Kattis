import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
        if(line.equalsIgnoreCase("OCT 31") || line.equalsIgnoreCase("DEC 25")) {
            System.out.println("yup");
        }else {
            System.out.println("nope");
        }

    }

}