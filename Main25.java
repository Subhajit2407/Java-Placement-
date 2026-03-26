import java.util.*;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isAscending = true;

        int prevDigit = num % 10; 
        num = num / 10;

        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit > prevDigit) {
                isAscending = false;
                break;
            }

            prevDigit = currentDigit;
            num = num / 10;
        }

        if (isAscending) {
            System.out.println("Digits are in ascending order");
        } else {
            System.out.println("Digits are not in ascending order");
        }
    }
}