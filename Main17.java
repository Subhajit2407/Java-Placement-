import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 0 && n <= 9) {
            System.out.println(n);
            return;
        }

        int lastDigit = n % 10;

        int temp = n;
        int divisor = 1;

        while (temp >= 10) {
            temp = temp / 10;
            divisor *= 10;
        }

        int firstDigit = temp;

        int middle = (n % divisor) / 10;
        int result = lastDigit * divisor + middle * 10 + firstDigit;

        System.out.println(result);
    }
}