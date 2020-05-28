import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int count = 0;
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            arr.add(l[i]);
        }
        double total = arr.size();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length() - 1; j++) {
                if (arr.get(i).charAt(j) == 'a' && arr.get(i).charAt(j + 1) == 'e') {
                    count++;
                    break;
                }
            }
        }

        if ((count / total) >= 0.4) {
            System.out.println("dae ae ju traeligt va");
        } else {
            System.out.println("haer talar vi rikssvenska");
        }

    }

}