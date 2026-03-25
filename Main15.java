import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int n = sc.nextInt();

        int lastDigit = n % 10;   // get last digit

        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10; // remove last digit step by step
        }

        int sum = firstDigit + lastDigit;

        // Output
        System.out.println(sum);
    }
}