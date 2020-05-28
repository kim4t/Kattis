import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        
        Map<String, String> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String line = null;
        while (sc.findInLine("(?=\\S)") != null) {

            String a = sc.nextLine();
            
            String[] arr1 = a.split(" ");
            
            map.put(arr1[1],arr1[0]);
            
        }
        //sc.nextLine();
        while (sc.hasNext()) {
            
            String l = sc.next();
            if(map.containsKey(l)) {
                System.out.println(map.get(l));
            }else {
                System.out.println("eh");
            }
            
        }

    }

}