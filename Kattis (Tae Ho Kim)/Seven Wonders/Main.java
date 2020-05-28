import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int tNum = 0;
        int cNum = 0;
        int gNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'T') {
                tNum++;
            } else if (arr[i] == 'C') {
                cNum++;
            } else {
                gNum++;
            }
        }
        int min = tNum;
        if (cNum < min) {
            min = cNum;
            if (gNum < min) {
                min = gNum;
            }
        }
        if(gNum<min) {
            min = gNum;
            if (gNum < min) {
                min = gNum;
            }
        }
        double print = Math.pow(tNum, 2) + Math.pow(cNum, 2) + Math.pow(gNum, 2);
        print += min * 7;
        System.out.println((int)print);
    }
}