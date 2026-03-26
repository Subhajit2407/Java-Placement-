import java.util.*;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num = num / 10;
        }

        System.out.println("Even Sum = " + evenSum + ", Odd Sum = " + oddSum);
    }
}