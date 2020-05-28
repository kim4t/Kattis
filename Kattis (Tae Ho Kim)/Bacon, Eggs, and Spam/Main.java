import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            Map<String, ArrayList<String>> map = new HashMap<>();
            ArrayList<String> ingredients = new ArrayList<>();
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            for (int i = 0; i < num; i++) {
                String name = sc.next();
                String[] things = sc.nextLine().substring(1).split(" ");
                for (int j = 0; j < things.length; j++) {
                    if (!map.containsKey(things[j])) {
                        ArrayList<String> arr = new ArrayList<>();
                        arr.add(name);
                        map.put(things[j], arr);
                        ingredients.add(things[j]);

                    } else {
                        ArrayList<String> arr = new ArrayList<>(map.get(things[j]));
                        arr.add(name);
                        map.put(things[j], arr);

                    }

                }

            }

            Collections.sort(ingredients);
            for (int j = 0; j < ingredients.size(); j++) {
                System.out.print(ingredients.get(j) + " ");
                ArrayList<String> arr = new ArrayList<>(map.get(ingredients.get(j)));
                Collections.sort(arr);
                for (int k = 0; k < arr.size(); k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}