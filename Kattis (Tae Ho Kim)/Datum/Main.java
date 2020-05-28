import java.util.Scanner;

public class Main {

    public static void main(String[] brgs) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();

        int monthArr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String darArr[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int month = 0;
        for (int i = 1; i < m; i++) {
            month += monthArr[i - 1];

        }
        int date = d + month;
        switch (date % 7) {
        case 0:
            System.out.println(darArr[2]);
            break;
        case 1:
            System.out.println(darArr[3]);
            break;
        case 2:
            System.out.println(darArr[4]);
            break;
        case 3:
            System.out.println(darArr[5]);
            break;
        case 4:
            System.out.println(darArr[6]);
            break;
        case 5:
            System.out.println(darArr[0]);
            break;
        case 6:
            System.out.println(darArr[1]);
            break;

        }

    }
}