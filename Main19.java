import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        n = Math.abs(n);
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n = n / 10;
        }

        System.out.println(product);
    }
}