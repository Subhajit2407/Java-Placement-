import java.util.Scanner;

public class Main18  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = Math.abs(n);

        int prevDigit = 10; 
        boolean isAscending = true;

        while (n > 0) {
            int currentDigit = n % 10;

            if (currentDigit > prevDigit) {
                isAscending = false;
                break;
            }

            prevDigit = currentDigit;
            n = n / 10;
        }
        if (isAscending) {
            System.out.println("Digits are in ascending order");
        } else {
            System.out.println("Digits are not in ascending order");
        }
    }
}