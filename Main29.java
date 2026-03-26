import java.util.*;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isIncreasing = true;

        int prevDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit >= prevDigit) {
                isIncreasing = false;
                break;
            }

            prevDigit = currentDigit;
            num /= 10;
        }

        if (isIncreasing) {
            System.out.println("Digits are in increasing order");
        } else {
            System.out.println("Digits are not in increasing order");
        }
    }
}